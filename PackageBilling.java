import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeBilling {
    
    String number;
    String name;
    String location;
    int Lastr;
    int Currentr;
    int units;
    double amount;
    double pmr;
    double cmr;
    double totAmount;

    Scanner sc = new Scanner(System.in);

    void getCustomerDetails(){
        System.out.println("Enter Your Number: " );
        number = sc.nextLine();

        System.out.println("Enter Your Name: " );
        name = sc.nextLine();
        
        System.out.println("Enter Your Location: " );
        location = sc.nextLine();
    }

    void getReading(){
        System.out.println("Enter Your Last meter Reading: " );
        Lastr = sc.nextInt();

        System.out.println("Enter Your Current meter Reading: " );
        Currentr = sc.nextInt();
    }

    void processBill() {
        units = Currentr - Lastr;
        amount = 1;
        
        if(units>500){
            amount = 50*units;
        }
        if(units < 500 && units > 300){
            amount = 25*units;
        }
        if(units <300 && units > 200){
            amount = 15*units;
        }
        if(units <200 && units > 100){
            amount = 10*units;
        }
        if(units<100){
            amount = 5*units;
        }
        cmr= 0.05 * units;
        pmr=  0.1* units;
        totAmount = amount + cmr + pmr;
    }
    void displayBill(){
        
        LocalDate Date = java.time.LocalDate.now();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Date : " + Date);
        System.out.println("Name : " + name);
        System.out.println("Number : " + number);
        System.out.println("Location : " + location);
        System.out.println("Units Used : " + units);
        System.out.println("Power Market Risk Charge : " + cmr);
        System.out.println("Capacity Market Risk Charge : " + pmr);
        System.out.printf("Amount to be paid : %.2f", totAmount);
        System.out.println();
        System.out.println("----------------------------------------------------------------");
    }

    
}

public class PackageBilling {
    public static void main(String[] args) {

        EmployeeBilling obj1 = new EmployeeBilling();
        obj1.getCustomerDetails();
        obj1.getReading();
        obj1.processBill();
        obj1.displayBill();


    }
}