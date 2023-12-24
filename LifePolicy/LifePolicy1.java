package LifePolicy;
//import java.util.Scanner;;
public class LifePolicy1 extends Userdetails{
    public void LifePolicy(int user, String name, int policyNumber, double insuredAmount, int timePeriod) {
       // super();

    }

    public double getMonthlyPremium() {
        // Calculate monthly premium based on insured amount and time period
        double premium = getInsuredAmount() / (getTimePeriod() * 12);
        System.out.println("--------------------Your monthly premium is mentioned below------------");
        return premium;
    }
}



