# Run a Java program with and without debug information

If you log to a console using System.out, how can you enable and disable the logging?

An approach is to create a log method that checks a system property and set the property at startup to enable logging and not set it when no logging is wanted.

The log method may look like this:

    private void log(String text) {
        String debug = System.getProperty("debug");
        if (debug != null) {
            System.out.println(text);
        }
    }

Calling this method may be done like this:

    public void checkBalance() {
        // do stuff
        log("My debug text");
        // more stuff
    }

Want to try it out and fiddle with the code? Clone this project and build as described below.

If you run this program and set the property `debug` like this `java -Ddebug` then the debug information will be printed. If you don't set it, no debug info will be printed. 

## Build:

    ./gradlew stage

## Run:

    java -jar ./build/libs/debug-switch-all.jar 

## Run with debug logging

    java -Ddebug -jar ./build/libs/debug-switch-all.jar 

