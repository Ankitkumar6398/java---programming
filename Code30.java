import java.util.Scanner;

public class Code30 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while(n!=0){
            int p = n%10;
            n = n/10;
            product = product *p;
        }
        System.out.println("the product of "+product);
        

    }
}
