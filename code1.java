public class code1 {
        public static int removeDuplicates(int[] nums) {
            int i = 0;
            for(final int num:nums)
                System.out.println(nums[i++]);

                //if(i<1||num>nums[i-1])
               //     nums[i++]=num;
          //  System.out.println(num);


            return i;
        }


    public static void main(String[] args) {
        int[] nums;
        nums = new int[]{1, 1, 2};
        /**System.out.println(**/ removeDuplicates(nums);


    }
}
