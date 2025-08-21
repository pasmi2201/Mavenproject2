
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
	@Test
	void testadd() {
		Calculator cop=new Calculator();
		int res=cop.add(3, 2);
		assertEquals(5,res,"2+3 should 5");
	}

}
