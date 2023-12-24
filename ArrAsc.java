import java.util.Arrays;
import java.util.Comparator;

public class ArrAsc{
    public static void main(String[] args) {
        int[] Arr={5,3,7,89,6,7,90,3,2,45};
       // int[] Arr2={5,3,7,89,6,7,90,3,2,45};

        Arrays.sort(Arr);
        System.out.println("sorted array in ascending order");

        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+",");
        }

        int[] reversed = new int[Arr.length];
        System.out.println("array in decending order is");
        for (int i = 0; i < Arr.length; i++) {
            reversed[i] = Arr[Arr.length - i - 1];
            System.out.print(reversed[i]+" ");
        }
       

//         Arrays.sort(Arr2 ,Comparator.reverseOrder());
//         System.out.println(Arrays.toString(Arr2));
//    for(int i=0;i<Arr2.length;i++)
//    {
//     System.out.print(Arr2[i], " ,");
//    }
    }
}