import java.util.Random;
import java.math.*;

public class ComputeMethods {
   public double FtoC (double degreesF){ // fartocel is short for farenheight to celsisus
      double celsius;
      celsius=(0.55556)*(degreesF-32); // this is the formula to convert farenheight into celsisus
      return(celsius); // this converts farenheight into celsius
   }


   public double hypotenuse (double a, double b){
    double c;
    c=Math.sqrt((a*a)+(b*b));
    return(c);  // finding the missing side
   }

public int roll(){
      Random rand = new Random();
      int die1 = rand.nextInt(6)+1;
      int die2 = rand.nextInt(6)+1;
      int sum=die1+die2;
      return(sum);

}

}

