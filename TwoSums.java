class TwoSums {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> save = new HashMap<>();
        int solu[] = new int[2];
        save.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(save.containsKey(target-nums[i]))
            {
                solu[0]=save.get(target-nums[i]);
                solu[1]=i;
                break;
            }else{
                save.put(nums[i],i);
            }

        }

        return solu;
    //https://leetcode.com/problems/two-sum/
    }
}
