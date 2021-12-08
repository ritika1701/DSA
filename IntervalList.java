class IntervalList {
    
    private int[] extractVal(int[] a,int[] b){
        if(a[0]>b[1]||b[0]>a[1])
            return null;
        
        return new int[]{
        Math.max(a[0],b[0]),Math.min(a[1],b[1])
            };
        
    }
    
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> solution = new ArrayList();
        int k=0,l=0;
        int a[]=new int[2];
        int b[]=new int[2];
        if(firstList.length==0|| secondList.length==0)
            return solution.toArray(new int[0][]);
        
        while(k<firstList.length&&l<secondList.length){
            
            a =firstList[k];
            b=secondList[l];
            
            int val[]=extractVal(a,b);
            if(val!=null){
                solution.add(val);
            }
         if(a[1]==b[1])
         {
             k++;
             l++;
         }else if(a[1]>b[1]){
             l++;
         }else{
             k++;
         }
            
        }
        
        
        return solution.toArray(new int[0][]);
	        
    } 
//https://leetcode.com/problems/interval-list-intersections/
}
