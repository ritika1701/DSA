import java.util.Scanner;
class BinarySearch{

    public int binarysearch(int[] nums,int beg,int end,int target){

        int mid = beg+(end-beg)/2;

        if(beg>end)
            return beg;

        if(nums[mid]==target)
            return mid;

        if(target<nums[mid])
            return binarysearch(nums,beg,mid-1,target);

        return binarysearch( nums,mid+1,end,target);

    }
    public int searchInsert(int[] nums, int target) {

        int size=nums.length;

        return binarysearch(nums,0,size-1,target);
    }

    public static void main(String[] args){

        int n,target;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        target = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        BinarySearch obj = new BinarySearch();
        int value = obj.searchInsert(a,target);
        System.out.println(value);

    }
    //https://leetcode.com/problems/search-insert-position/
}