
import junittest.MessageUtil;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Poozer
 */
public class Message {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);
    int numberValue = 0;
    int numberValue1 = 1;
    int numberValue2 = 0;
    String stringValue;

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }
    @Test
    public void testAssertTrue(){
       assertTrue(this.numberValue != 1);               
    }
    @Test
    public void testAssertTrue2(){
        assertTrue(this.numberValue != this.numberValue1);
    }
    @Test
    public void testAssertFalse(){
        assertFalse(this.numberValue == this.numberValue1);
    }
    @Test
    public void testAssertNull(){
        assertNull(stringValue);
    }
    @Test
     public void testAssertNotNull(){
        assertNotNull(numberValue);
    }
    @Test
    public void testAssertSame(){
       assertSame(numberValue, numberValue2);
    }
    @Test
     public void testAssertNotSame(){
        assertNotSame(numberValue, numberValue1);
    }
    @Test
    public void testAssertTrue3(){
       assertTrue(numberValue < numberValue1);
    }
}
