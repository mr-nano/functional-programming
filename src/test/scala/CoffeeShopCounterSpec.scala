import org.scalatest.{FunSuite, Matchers}

class CoffeeShopCounterSpec extends FunSuite with Matchers {
  test("should call credit card with $10 when buying a cup of coffee") {
    CoffeeShopCounter.buy(MockedCreditCard)
    MockedCreditCard.calledWith should be(10)
  }
}
