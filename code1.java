public class code1 {
         public static void Linear(int[] arr, int n){
        for(int i = 0;i< arr.length;i++){
            if(arr[i]==n){
                System.out.println("Present");
            break;}
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {2,4,1,4,54,65,23,45};
        Linear(arr,n);

    }
}
