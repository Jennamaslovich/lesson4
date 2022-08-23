public class CalculatorTest2 {
    public static void main(String[] args) {
        //Instantiate a Calculator2 object

        Calculator2 calc = new Calculator2();
        calc.originalPrice = 10;
        System.out.println (calc.findTotal()); // start at 10 goes to 12

        calc.originalPrice = 12;
        System.out.println (calc.findTotal()); // starts at 12 goes to 14.4


        calc.originalPrice = 9;
        System.out.println (calc.findTotal()); // starts at 9 goes to 10.8


        calc.originalPrice = 8;
        System.out.println (calc.findTotal()); // starts at 8 goes to 9.6


        calc.originalPrice = 7;
        System.out.println (calc.findTotal()); // starts at 7 goes to 8.4


        calc.originalPrice = 15;
        System.out.println (calc.findTotal()); // starts at 15 goes to 18


        calc.originalPrice = 11;
        System.out.println (calc.findTotal()); // starts at 11 goes to 13.2


        calc.originalPrice = 30;
        System.out.println (calc.findTotal()); // starts at 30 goes to 36




        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party


        
    }
}
