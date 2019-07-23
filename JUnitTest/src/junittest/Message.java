package junittest;

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

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }
    public void testAssertTrue(){
       assertTrue(this.numberValue != 1);
       //if (testAssertTrue = true){
       //    System.out.println("True");
       //} else{
       //    System.out.println("False");
       //}
               
    }
    public void testAssertTrue2(){
        assertTrue(this.numberValue == this.numberValue1);
    }
    public void testAssertFalse(){
        assertFalse(this.numberValue == this.numberValue1);
    }
}
