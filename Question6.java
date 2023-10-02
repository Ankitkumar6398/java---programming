import java.util.*;
public class Question6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();

        int max = sc.nextInt();
        int diff = sc.nextInt();
        int i = min;
        while(i<=max){
            int c = (i - 32)*5/9;
            System.out.println(i+" "+c);
            i = i+diff;
        }
        // Your Code Here
    }
}
