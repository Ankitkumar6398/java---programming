import java.util.*;
public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";
        for(int i = 0;i<str.length();i++){
            rev = str.charAt(i)+rev;
        }
        System.out.println(rev);
        // Your Code Here
    }
}
