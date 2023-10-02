import java.util.Scanner;

public class Code26 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(i);

        }
        System.out.println(" the sum" +sum);
    }
}
