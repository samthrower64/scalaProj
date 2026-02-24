import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.mutable.ArrayBuffer
import scala.language.postfixOps

class CustomerTest extends AnyFlatSpec with Matchers {

  val customer = new Customer
  val customerNameList = new CustomerNameList

  val mockCustomer : ArrayBuffer[Any] = customer.generateCustomer(customer.randIntGen())

  behavior of "a customers details"
    it should "populate the array with a first name" in {
      customer.generateCustomer(customer.randIntGen())
      assert(customer.generatedCustomers(0).toString != "")
      // assert(customer.generatedCustomers(0).isInstanceOf[String]) // Some test here for Data Type checking
    }
    it should "populate the array with a surname" in {
      customer.generateCustomer(customer.randIntGen())
      assert(customer.generatedCustomers(1).toString != "")
    }
    it should "populate the array with an age" in {
      val x = customer.randIntGen()
      assert(x > -1 && x < customer.randIntGen())
      customer.generateCustomer(x)
      assert(customer.generatedCustomers(2) != 0)
    }

}
