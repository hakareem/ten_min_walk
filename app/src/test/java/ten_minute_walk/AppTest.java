package ten_minute_walk;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testGivenACorrectList() {
        App test = new App();
        char[] list = {'w', 's', 'e', 'e', 'n', 'n', 'e', 's', 'w', 'w'};

        assertEquals(true, test.ten_minute_walk(list));
    }

    @Test public void testGivenAWrongList() {
        App test = new App();
        char[] list = {'w', 's', 'e', 'n', 'n', 'e', 's', 'w', 'w', 'w'};

        assertEquals(false, test.ten_minute_walk(list));
    }

    @Test public void testGivenAShortList() {
        App test = new App();
        char[] list = {'w', 's'};

        assertEquals(false, test.ten_minute_walk(list));
    }

    @Test public void testGivenALongList() {
        App test = new App();
        char[] list = {'w', 's', 'e', 'e', 'n', 'n', 'e', 's', 'w', 'w', 'w' ,'s'};

        assertEquals(false, test.ten_minute_walk(list));
    }

}


// ten_minute_walk?(['w', 's', 'e', 'n', 'n', 'e', 's', 'w', 'w', 'w']) # => false
// ten_minute_walk?(['w', 's', 'e', 's', 's', 'e', 's', 'w', 'n', 'n']) # => false
// ten_minute_walk?(['w', 's']) # => false