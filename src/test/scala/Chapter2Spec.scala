import org.scalatest._

class Chapter2Spec extends FlatSpecLike with Matchers {

  "ex1" should "return the sign of a number" in {
    Chapter2.ex1(2) should be (1);
    Chapter2.ex1(0) should be (0);
    Chapter2.ex1(-5) should be (-1);

  }

}
