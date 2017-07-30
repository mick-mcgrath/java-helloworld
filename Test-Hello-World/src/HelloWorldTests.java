import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTests {

	@Test
	public void testPrintMessage() {
		String message = "Hello World!";	
	    assertEquals(message,HelloWorld.printMessage());
	}
		
}






