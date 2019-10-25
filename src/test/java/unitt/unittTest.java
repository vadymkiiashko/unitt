package unitt;

import org.junit.Test;

import static org.junit.Assert.*;

public class unittTest {

    @Test
    public void multiply() {

        unitt myUnitt = new unitt();
            float result = myUnitt.multiply(9,2);
            assertEquals(18, result,1);
        System.out.println("Test's been successful");
    }
}