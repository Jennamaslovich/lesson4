public class Calculator4 {


    public static void main(String[] args) {
    }

    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values / didnt change
    public double originalPrice;
    public double total;
    public String total1;
    public String name;
    public String findTotal () {
        //Calculate an individual's total after tax and tip
        //Print this value

        total = originalPrice * ((1 + tax + tip)+((30/6)+(15/6))); //Hellenshares and AlexShares
        double d = total;
        String total1 = Double.toString(d); // + HellenShares + AlexShares; helen is the 8th person
        return(total1);
    }

}

