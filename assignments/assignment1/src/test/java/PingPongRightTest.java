import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PingPongRightTest {
    
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
    public void testPingPongRight_produces_expected_stdoutTest() throws Exception {
	PingPongRight.main(null);
	String expected = expected();

	System.err.println(out.toString());
	System.err.println(expected);
	assertThat (out.toString(),is(expected));
    }

    private String expected() { 
        append("Ready...Set...Go!");
	append("Ping!(1)");
	append("Pong!(1)");
	append("Ping!(2)");
	append("Pong!(2)");
	append("Ping!(3)");
	append("Pong!(3)");
	append("Ping!(4)");
	append("Pong!(4)"); 
	append("Ping!(5)");
	append("Pong!(5)");
	append("Ping!(6)");
	append("Pong!(6)");
	append("Ping!(7)");
	append("Pong!(7)");
	append("Ping!(8)");
	append("Pong!(8)");
	append("Ping!(9)");
	append("Pong!(9)");
	append("Ping!(10)");
	append("Pong!(10)");
	append("Done!");
	return sb.toString();
    }

    private StringBuilder append (String append) {
	sb.append(append);
	sb.append(System.getProperty("line.separator"));
	return sb;
    }
}
