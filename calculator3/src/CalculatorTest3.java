public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();

            calc.originalPrice = 10;
            System.out.println ("Jenna's total: $"+calc.findTotal()); // start at 10 goes to 12

            calc.originalPrice = 12;
            System.out.println ("Dana's total: $"+calc.findTotal()); // starts at 12 goes to 14.4


            calc.originalPrice = 9;
            System.out.println ("Luna's total: $"+calc.findTotal()); // starts at 9 goes to 10.8


            calc.originalPrice = 8;
            System.out.println ("Josh's total: $"+calc.findTotal()); // starts at 8 goes to 9.6


            calc.originalPrice = 7;
            System.out.println ("George's total: $"+calc.findTotal()); // starts at 7 goes to 8.4


            calc.originalPrice = 15;
            System.out.println ("Alex's total: $"+calc.findTotal()); // starts at 15 goes to 18


            calc.originalPrice = 11;
            System.out.println ("Manny's total: $"+calc.findTotal()); // starts at 11 goes to 13.2


            calc.originalPrice = 30;
            System.out.println ("Hellen's total: $"+calc.findTotal()); // starts at 30 goes to 36
         
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
