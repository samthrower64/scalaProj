import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class Customer extends CustomerNameList {

  final val rand = Random

  def getCustomerAge() : Int = {
    val age = rand.between(16, 115)
    age
  }

  def randIntGen() : Int = {
    var randInt : Int = 0
    if (firstNames.length > surNames.length) {
      randInt = rand.nextInt(firstNames.length)
    }
    else {
      randInt = rand.nextInt(surNames.length)
    }
    randInt
  }
  def generateCustomer(i : Int) : ArrayBuffer[Any] = {
    val firstName : String = firstNames(randIntGen())
    val surName : String = surNames(randIntGen())
    val age : Int = getCustomerAge()
    generatedCustomers.addOne(fulfilCustomerDetails(firstName, surName, age))
  }

  def fulfilCustomerDetails(firstName: String, surName: String, age: Int): ArrayBuffer[Any] = {
    val customer = ArrayBuffer[Any]()
      customer.addOne(firstName)
      customer.addOne(surName)
      customer.addOne(age)
  }

  val generatedCustomers = ArrayBuffer[Any]()
  }
