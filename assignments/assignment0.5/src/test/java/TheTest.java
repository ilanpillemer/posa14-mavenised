import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TheTest {
    
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private StringBuilder sb = new StringBuilder();

    @Before
    public void setUp() {
    	System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() {
    	System.setOut(null);
    }

    @Test
    public void testPalantirManagerTest() throws Exception {
	PalantirManagerTest.main(null);
	System.err.println(out.toString());
	if (out.toString().contains("failed")) fail();
    }
}
