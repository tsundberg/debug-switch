package se.thinkcode.balance;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AndelsbankenTest {
    private ByteArrayOutputStream stdOut;

    @Before
    public void setUp() {
        stdOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdOut));
    }

    @Test
    public void no_debug_logging() {
        Andelsbanken andelsbanken = new Andelsbanken();

        andelsbanken.checkBalance();

        String debugLogging = stdOut.toString();
        assertThat(debugLogging).isEmpty();
    }

    @Test
    public void debug_logging() {
        System.setProperty("debug", "enabled");

        Andelsbanken andelsbanken = new Andelsbanken();

        andelsbanken.checkBalance();

        String debugLogging = stdOut.toString();
        assertThat(debugLogging).isNotEmpty();
    }

}
