class rotate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        k = k % nums.length;
        
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int position = (i + k) % nums.length;
            result[position] = nums[i];
        }
        
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}