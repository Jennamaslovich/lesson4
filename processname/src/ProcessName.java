import java.util.Scanner;


class ProcessName {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int spaceIdx;
        String firstName;
        String lastName;

        System.out.print("Enter your name: ");

        String name = console.nextLine();

        spaceIdx = name.indexOf(" ");

        firstName = name.substring(0,spaceIdx);


        lastName = name.substring(spaceIdx, name.length());


        System.out.println("Your Name: "+firstName+" "+lastName); // type your full name first and last

        String initial = name.substring(0, 1);

        System.out.println("Your Name is : "+lastName+", "+initial+". "); // this will pull your first inital from your first name

        console.close();
    } // closes method 
} // closes the class