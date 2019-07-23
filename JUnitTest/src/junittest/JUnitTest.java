package junittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 *
 * @author Poozer
 */
public class JUnitTest {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Message.class);
        
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    
        System.out.println(result.wasSuccessful());
    }
    
}
