object Main {
  def main(args: Array[String]): Unit = {
    val customer = new Customer()

    customer.generateCustomer(customer.randIntGen())
    customer.generatedCustomers.foreach(println)
  }
}

