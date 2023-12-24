package Billing;
import java.time.LocalDate;
import java.util.Scanner;
public class EmployeeBilling {
    String number;
    String name;
    String location;
    int Lastreading;
    int Currentreading;
    int units;
    double amount;
    double pmr;
    double cmr;
    double totAmount;

    Scanner sc = new Scanner(System.in);


    void customerdetails(){

        System.out.println("-------Welcome to Kerala Electricity Board-------");
        System.out.println("-------Please Provide your details!-------");

        System.out.println("Enter Your Registered Mob:Number: " );
        number = sc.nextLine();

        System.out.println("Enter Your Name: " );
        name = sc.nextLine();
        
        System.out.println("Enter Your Location: " );
        location = sc.nextLine();
    }

    void readingdetails(){
        System.out.println("Enter Your Last meter Reading: " );
        Lastreading = sc.nextInt();

        System.out.println("Enter Your Current meter Reading: " );
        Currentreading = sc.nextInt();
    }

    void Billcalc() {
        units = Currentreading - Lastreading;
        amount = 1;
        
        if(units>=500){
            amount = 50*units;
        }
        if(units <= 499 && units >= 300){
            amount = 25*units;
        }
        if(units <=299 && units>=200){
            amount = 15*units;
        }
        if(units <=199 && units >= 100){
            amount = 10*units;
        }
        if(units<=99){
            amount = 5*units;
        }
        cmr= 0.05 * units;
        pmr=  0.1* units;
        totAmount = amount + cmr + pmr;
    }
    void Billdisp(){
        
        LocalDate date=java.time.LocalDate.now();
        System.out.println();
        System.out.println("Your Today Month EB Billibgs Are Here!");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Date : " + date);
        System.out.println("Name : " + name);
        System.out.println("Number : " + number);
        System.out.println("Location : " + location);
        System.out.println("Units Used : " + units);
        System.out.println("Amount according to the units that you have spend: "+amount);
        System.out.println("Power Market Risk Charge : " + pmr);
        System.out.println("Capacity Market Risk Charge : " + cmr);
        System.out.printf("Total Amount to be paid(Inclusive of all amounts) : %.2f", totAmount);
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                        Thank You                                ");
    }
}
