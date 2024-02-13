import java.util.Scanner;

//This is an example showing control operations
//booleans
//
public class Comparison {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        if(number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
            //logical test, if the two number are equal print that they are equal
            //first %d will be replaced with number1, second will number2, %n will be replaced with a new line
        }
    }
}
