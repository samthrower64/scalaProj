import java.sql.*
import scala.collection.mutable.ArrayBuffer

object CustomerDatabaseConnection extends Customer {

  def getConnection: Connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/customers", "root", "password"
  )

  def storeCustomerInDb(customer: ArrayBuffer[Any]): Unit = {
    getConnection
    val fn = customer(0).toString
    val sn = customer(1).toString
    val age = customer(2).toString

    val sql = s"INSERT INTO customer (firstName surName age) VALUES (???);"

    val statement = getConnection.prepareStatement(sql)
    statement.setString(1, fn)
    statement.setString(2, sn)
    statement.setString(3, age)
    statement.executeUpdate()
    statement.close()
    try {
      storeCustomerInDb(generatedCustomers)
      getConnection.close()
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }
}