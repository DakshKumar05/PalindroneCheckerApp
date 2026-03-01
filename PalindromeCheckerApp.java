public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Palindrome Checker System ");
        System.out.println("=================================");
        System.out.println("Welcome to the Application!");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");
        
        // if the user provided text arguments, show them as examples
        if (args.length > 0) {
            System.out.println("\nInput arguments:");
            for (String arg : args) {
                System.out.println("  " + arg);
            }
        }
    }
}