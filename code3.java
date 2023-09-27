public class code3 {
    public static void sum1(int num ,int n,int sum){
        if(num==n){
            sum+=num;
            System.out.println(sum);
            return ;
        }
        sum = sum+num;
        sum1(num+1,n,sum);

    }

    public static void main(String[] args) {
        int num = 1;
        int n = 5;
        sum1(num,n,0);

    }
}
