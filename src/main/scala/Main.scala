object Main extends Customer {
  def main(args: Array[String]): Unit = {
    val customer = new Customer()

    generateCustomer(customer.randIntGen())
    generatedCustomers.foreach(println)

    // CustomerDatabaseConnection.storeCustomerInDb(customer.generatedCustomers.foreach)
  }
}

