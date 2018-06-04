import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaBuzzTest {
    JavaBuzz javabuzz = new JavaBuzz();

    @Test
    public void returnsNormalNumber() {
        assertEquals(javabuzz.javabuzzify(1), "1");
    }

    @Test
    public void returnsNormalNumberWithOtherNumber() {
        assertEquals(javabuzz.javabuzzify(2), "2" );
    }

    @Test
    public void returnsJavaForThree() {
        assertEquals(javabuzz.javabuzzify(3), "Java");
    }

    @Test
    public void returnsJavaForAnotherMultipleOfThree() {
        assertEquals(javabuzz.javabuzzify(6), "Java");
    }

    @Test
    public void returnBuzzForFive() {
        assertEquals(javabuzz.javabuzzify(5), "Buzz");
    }

    @Test
    public void returnBuzzForAnotherMultipleOfFive() {
        assertEquals(javabuzz.javabuzzify(10), "Buzz");
    }

    @Test
    public void returnJavaBuzzForFifteen() {
        assertEquals(javabuzz.javabuzzify(15), "JavaBuzz");
    }

    @Test
    public void returnJavaBuzzForANotherMultipleOfFifteen() {
        assertEquals(javabuzz.javabuzzify(30), "JavaBuzz");
    }
}