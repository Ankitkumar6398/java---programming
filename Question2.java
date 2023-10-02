import java.util.*;
public class Question2 {
    public static void main(String args[]) {
        Scanner sc=  new Scanner(System.in);
        int n= sc.nextInt();
        int ans = sc.nextInt();
        int count = 0;
        while(n!=0){
            int x = n%10;
            if(ans==x){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
