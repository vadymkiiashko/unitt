package arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class arrayMinMaxTest {

    @Before
    public  void setup(){
    }
    int[] array = {-3,-1,0,1,2,3,3,5,6};
    arrayMinMax MyTest = new arrayMinMax();

    @Test
    public void arrayMin() {


        int result = MyTest.arrayMin(array);
        assertEquals(-3,result,1);
    }

    /*@Test
    public void arrayMax() {

        arrayMinMax MyTest = new arrayMinMax();
        int result = MyTest.arrayMax(array);
       assertEquals(6,result,1);
    }*/
}