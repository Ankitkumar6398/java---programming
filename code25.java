public class code25 {
    public static int maximumCount(int[] nums) {
        int p=0;
        int n = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                p = p+1;
                System.out.println(p+"positive");
            }else if(nums[i]<0){

                n= n+1;
                System.out.println(n+ " negative");}

        }
        if(p>n){
            System.out.println(p);
            return p;

        }
        else  {
           // System.out.println(n);
            return n;
        }
        //
        }


    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
       // Positive(nums);
        System.out.println( maximumCount(nums));
    }
}
