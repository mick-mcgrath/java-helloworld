import org.junit.Test;
import static org.junit.Assert.*;

public class MyJUnitClassTest {
	
	@Test
	public void addTest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(100, 200);
		assertEquals(300,result);
	}
	
	@Test
	public void ConCatTest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.Concat("Hello", "World");
		assertEquals("HelloWorld",result);
	}
	
	
}
