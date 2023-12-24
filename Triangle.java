import java.util.Scanner;
public class Triangle{
    public static void main(String[] args) {
        System.out.println("enter the no:of rouws");
        Scanner sc= new Scanner(System.in);
        int Rows=sc.nextInt();
       
        int i,j;
        for(i=1;i<=Rows;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
