import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int factorial=1;
        int i=1;
         while(i<=num){
         factorial=factorial*i;
         i++;
         }
         System.out.println(num+"!="+factorial);
    }
}
