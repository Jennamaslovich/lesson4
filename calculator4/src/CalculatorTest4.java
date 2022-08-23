public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();

      calc.originalPrice=10;
        System.out.println ("Jenna's total: $"+calc.findTotal()); // 82


        calc.originalPrice = 12;
        System.out.println ("Dana's total: $"+calc.findTotal()); // 98.4


        calc.originalPrice = 9;
        System.out.println ("Luna's total: $"+calc.findTotal()); //73.8


        calc.originalPrice = 8;
        System.out.println ("Josh's total: $"+calc.findTotal()); // 65.6


        calc.originalPrice = 7;
        System.out.println ("George's total: $"+calc.findTotal()); // 57.4


        calc.originalPrice = 15;
        System.out.println ("Alex's total: $"+calc.findTotal()); // 123


        calc.originalPrice = 11;
        System.out.println ("Manny's total: $"+calc.findTotal()); // 90.2


        calc.originalPrice = 30;
        System.out.println ("Hellen's total: $"+calc.findTotal()); // 246




       
    } 
}
