class Solution {
    
    /*public int binarySearch(int[] arr,int beg,int end,int target){
        
        int mid= beg+(end-beg)/2;
        if(beg>end){
            return beg;
        }
        
        if(arr[mid]==target)
            return mid;
        
        if(arr[mid]>target)
            return binarySearch(arr,beg,mid-1,target);
        
        return binarySearch(arr,mid+1,end,target);
        
    }*/
    
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i=0,j=matrix[0].length-1;
        
        while(i<matrix.length&&j>=0){
            
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]>target)
                j--;
            else
                i++;
            
        }
        
        return false;
        /*int m= matrix.length;
        int n= matrix[0].length,i;
        
        int [] arr = new int [m];
        
        for(i=0;i<m;i++){
            
            arr[i]=matrix[i][0];
        }
        
        int row = binarySearch(arr,0,m-1,target);
        
        if(row==m)
            row--;
        if(matrix[row][0] == target)
            return true;
        
        if(matrix[row][0]>target && row<m && row>0)
            row--;
        
        arr=new int[n];
        
        for(i=0;i<n;i++){
            
            arr[i]=matrix[row][i];
        }
        int col = binarySearch(arr,0,n-1,target);
        if(col==n)
            col--;
        if(matrix[row][col] == target)
            return true;
        
        return false;
        */
    }
}//https://leetcode.com/problems/search-a-2d-matrix/
