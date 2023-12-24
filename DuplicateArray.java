import java.util.HashSet;
import java.util.Set;

class DuplicateArray {
    public static void main(String[] args) {
        int arr[] ={1, 2, 5, 5, 6, 6, 7, 2, 5};
        System.out.println("the array that you have entered is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nduplicate array values are");
        Set<Integer> duplicates = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[i]);
                }
            }
        }
        System.out.println(duplicates);
    }
}
