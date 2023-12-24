// public class Hellowworld {
//    public static void main(String[] args) {
//    //  System.out.print("HELLO WORLD");
   
//    } 
// }

import java.util.Scanner;

public class Hellowworld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predetermined size of the array
        int size = 5; // Change this value to the desired size

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter elements for the array
        System.out.println("Enter " + size + " elements for the array:");

        // Loop to get elements for the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the entered array
        System.out.println("Entered array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
