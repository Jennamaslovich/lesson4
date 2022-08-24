import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)

    { Scanner sc = new Scanner(System.in);

       System.out.println("(1/2) Enter Your Height in Inches:"); // sout for shortcut
        double height=sc.nextDouble();

        System.out.println("(2/2) Enter Your Weight in Pounds:");
        double weight=sc.nextDouble();

        double bmi;
        bmi=weight/(height*height)*703; // this is the calculation that will give you your bmi

        System.out.println("My BMI score: "+bmi+"");


// example: my weight: 300 pounds, height: 64 inches - output should be 51.5


    }
}







