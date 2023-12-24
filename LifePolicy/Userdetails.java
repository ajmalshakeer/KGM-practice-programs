package LifePolicy;
import java.util.Scanner;
public class Userdetails {

    int userId;
    String name;
      int policyNumber;
     double insuredAmount;
      int timePeriod;


    public Userdetails() {
        // int userId;
        // String name;
        //   int policyNumber;
        //  double insuredAmount;
        //   int timePeriod;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the user id: ");
        userId=sc.nextInt();

        System.out.println("enter the user name: ");
        name=sc.next();

        System.out.println("enter the Policy number: ");
        policyNumber=sc.nextInt();


        System.out.println("enter the insured amount: ");
        insuredAmount=sc.nextDouble();

        System.out.println("enter the time period: ");
        timePeriod=sc.nextInt();

        // public  Userdetails(int userId, String name, int policyNumber, double insuredAmount, int timePeriod) {
        //     this.userId = userId;
        //     this.name = name;
        //     this.policyNumber = policyNumber;
        //     this.insuredAmount = insuredAmount;
        //     this.timePeriod = timePeriod;

    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public double getInsuredAmount() {
        return insuredAmount;
    }

    public int getTimePeriod() {
        return timePeriod;
    }
    public static void main(String[] args) {
       
        LifePolicy1 policy = new LifePolicy1();
    double monthly_premium= policy.getMonthlyPremium();
    System.out.println("\n                            " + monthly_premium);
    System.out.println("\n------------------------------Thank You------------------------");
      }
}

   
