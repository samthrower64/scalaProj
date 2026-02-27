import scala.collection.mutable.ListBuffer

object Main extends Customer {
  def main(args: Array[String]): Unit = {
    val customer = new Customer()
    val customerdb = CustomerDatabaseConnection

    generateCustomer(customer.randIntGen())
    generatedCustomers.foreach(println)
    customerdb.storeCustomerInDb(generatedCustomers)
  }
}

