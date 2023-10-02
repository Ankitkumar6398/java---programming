import java.util.*;
public class Question1 {



        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int c = 1;
            int even = 0;
            int odd= 0;
            while(n>0){
                int x = n%10;
                n= n/10;
                if(c%2==1){
                    even = even+x;
                }else{
                    odd = odd+x;
                }
                c++;
            }
            System.out.println(even);
            System.out.println(odd);

        }
    }

