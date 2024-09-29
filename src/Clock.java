import java.util.Scanner;

public class Clock {

    // Converts seconds to minutes
    public static double secondsToMinutes(int seconds) {
        return seconds / 60.0; // 1 minute = 60 seconds
    }

    // Converts seconds to hours
    public static double secondsToHours(int seconds) {
        return seconds / 3600.0; // 1 hour = 3600 seconds
    }

    // Converts minutes to seconds
    public static int minutesToSeconds(int minutes) {
        return minutes * 60; // 1 minute = 60 seconds
    }

    // Converts minutes to hours
    public static double minutesToHours(int minutes) {
        return minutes / 60.0; // 1 hour = 60 minutes
    }

    // Converts hours to seconds
    public static int hoursToSeconds(int hours) {
        return hours * 3600; // 1 hour = 3600 seconds
    }

    // Converts hours to minutes
    public static int hoursToMinutes(int hours) {
        return hours * 60; // 1 hour = 60 minutes
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueConversion;

        do {
            // Display conversion options
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");
            System.out.print("Choose the Conversion: ");
            int choice = scanner.nextInt();

            System.out.print("Enter the Value: ");
            int value = scanner.nextInt();
            double result = 0;

            // Perform conversion based on user choice
            switch (choice) {
                case 1:
                    result = secondsToMinutes(value);
                    System.out.println("Seconds to Minutes: " + result);
                    break;
                case 2:
                    result = secondsToHours(value);
                    System.out.println("Seconds to Hours: " + result);
                    break;
                case 3:
                    result = minutesToSeconds(value);
                    System.out.println("Minutes to Seconds: " + result);
                    break;
                case 4:
                    result = minutesToHours(value);
                    System.out.println("Minutes to Hours: " + result);
                    break;
                case 5:
                    result = hoursToSeconds(value);
                    System.out.println("Hours to Seconds: " + result);
                    break;
                case 6:
                    result = hoursToMinutes(value);
                    System.out.println("Hours to Minutes: " + result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            // Ask user if they want to convert again
            System.out.print("Do you want to convert time? (Y/N): ");
            continueConversion = scanner.next();
        } while (continueConversion.equalsIgnoreCase("Y"));

        scanner.close();
    }
}