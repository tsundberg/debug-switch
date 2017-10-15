package se.thinkcode.balance;

public class Andelsbanken {
    public void checkBalance() {
        // do stuff
        log("My debug text");
        // more stuff
    }

    private void log(String text) {
        String debug = System.getProperty("debug");
        if (debug != null) {
            System.out.println(text);
        }
    }
}
