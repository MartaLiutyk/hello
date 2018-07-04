import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Scanner;

public class Log4jExample {
    static Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) throws TooShortNameException {
        getUserName();
        PropertyConfigurator.configure("log4j.properties");
        logger.warn("warn log");
        logger.error("error log");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                logger.info("Number is odd !!");
            } else {
                logger.debug("The number is even");
            }
        }
    }

    public static void getUserName() throws TooShortNameException {
        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
		System.out.println("hhello:");
        userName = scanner.nextLine();
        if (userName.length() > 3) {
            System.out.print("Your name is" + userName);
        } else {
            throw new TooShortNameException(userName);
        }
    }
}
