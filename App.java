import java.util.Scanner;

public class App {
    static Calculator calc = new Calculator();
    static final Scanner inputScanner = new Scanner(System.in);
    static String prompt = "input a double:";
    static String prompt2 = "Do you want to continue? (y/n):";
    static String[] options = new String[] {"add", "subtract", "multiply", "divide", "exit"};
    

    public static void main(String[] args){
        while (true) {
            System.out.println("What would you like to do?: ");
            for (String option : options) {
                System.out.println(option);
            }
            
            //System.out.printf("You want to add %.1f and .1%f", num1, num2);

            String userOption = getString("> ");

            if(userOption.equalsIgnoreCase("add")){
                Double num1 = getDouble(prompt);
                Double num2 = getDouble(prompt);
                Double addResult = calc.add(num1, num2);
                System.out.println("Answer:" + addResult);
            }

            if(userOption.equalsIgnoreCase("subtract")){
                Double num1 = getDouble(prompt);
                Double num2 = getDouble(prompt);
                Double subResult = calc.substract(num1, num2);
                System.out.println("Answer:" + subResult);
            }

            if(userOption.equalsIgnoreCase("multiply")){
                Double num1 = getDouble(prompt);
                Double num2 = getDouble(prompt);
                Double multResult = calc.multiply(num1, num2);
                System.out.println("Answer:" + multResult);
            }

            if(userOption.equalsIgnoreCase("divide")){
                Double num1 = getDouble(prompt);
                Double num2 = getDouble(prompt);
                Double divResult = calc.divide(num1, num2);
                System.out.println("Answer:" + divResult);
            }

            if(userOption.equalsIgnoreCase("exit")){
                System.out.println("Goodbye!");
                break;
            }
        }
    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        String userString = inputScanner.nextLine();
        return userString;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        Double userDouble = inputScanner.nextDouble();
        inputScanner.nextLine(); 
        return userDouble;
    }

    // private static Double getDoubleFromString(String prompt){
    //     System.out.println(prompt);
    //     String userInput = inputScanner.nextLine();
    //     String userInputNoSpace = userInput.replaceAll(" ", "");
    //     String firstNum = userInputNoSpace.substring(0, 1);
    //     Double double1 = Double.parseDouble(firstNum);
    //     System.out.println(double1);
    //     String secNum = userInputNoSpace.substring(1);
    //     Double double2 = Double.parseDouble(secNum);
    //     System.out.println(double2);
    //     return double1;
    // }
}