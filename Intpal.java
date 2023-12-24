import java.util.Scanner;

public class Intpal{
    public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
                int reversed = 0;
                //int original = num;
                
                while (num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num /= 10;
                }
              System.out.println("the reversed number is"+ reversed);  
            }
            // public static void main(String[] args) {
            //     System.out.println("enter a number");
            //     Scanner sc = new Scanner(System.in);
            //     int str=sc.nextInt();
            //     System.out.println(numrev(str));
            // }
        }
        