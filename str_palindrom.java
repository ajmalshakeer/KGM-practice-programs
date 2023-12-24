import java.util.*;

public class str_palindrom {
    public static String is_palindrome(String a) {
        a=a.toLowerCase();
        int length = a.length();
        for (int i = 0; i < length/2; i++) {
            if (a.charAt(i) != a.charAt(length-i-1))
                return "The string '" + a + "' is not a palindrome";
        }
        return "The string '" + a + "' is a palindrome";
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(is_palindrome(str));
    }
}

