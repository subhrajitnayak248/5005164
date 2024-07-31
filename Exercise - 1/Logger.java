public class Logger {
    private static Logger logger;
    private Logger() {
    }

    public static Logger logger() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("logger1: "+logger1);
        System.out.println("logger2: "+logger2);
        // Test the singleton property
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 reference the same instance.");
        } else {
            System.out.println("logger1 and logger2 reference different instances.");
        }

        // Log messages using the logger instance
        logger1.log("This is a log message.");
        logger2.log("This is another log message.");
    }
}


