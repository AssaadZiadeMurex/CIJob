import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomTest {


    @Test
    public void successfulTest() {
        assertEquals(1, RandomCode.getOne());
    }
    @Test
    public void anotherSuccessfullTest() {
        assertEquals("Hello World", "Hello World");
    }

}
