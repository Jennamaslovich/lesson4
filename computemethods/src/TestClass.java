public class TestClass {

    public static void main(String args[]) {
        ComputeMethods meth=new ComputeMethods();


        System.out.println("The Tempature in Celsius:"+meth.FtoC(100.4)+"C"); // output should be 38.0003
        System.out.println("The sum of the dice values is: "+meth.roll());
        System.out.println("Hypotenuse="+meth.hypotenuse(8.7,6.5));

    }
}
