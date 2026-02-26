import java.sql.*
import scala.collection.mutable.ArrayBuffer

object CustomerDatabaseConnection extends Customer {

  def getConnection: Connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/customers", "root", "password"
  )

  def storeCustomerInDb(customer: ArrayBuffer[Any]): Unit = {
    val fn = customer(0)
    val sn = customer(1)
    val age = customer(2)

    val statement = getConnection.prepareStatement(
      s"INSERT INTO customer (firstName, surName, age) VALUES ($fn, $sn, $age);"
    )

    statement.executeUpdate()
    statement.close()
  }

    try {
      getConnection
      storeCustomerInDb(generatedCustomers)
      getConnection.close()
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }