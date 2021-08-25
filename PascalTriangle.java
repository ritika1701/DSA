class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> solution = new ArrayList<>();
        
        List<Integer> solu = new ArrayList<>();
        solu.add(1);
        solution.add(solu);
        for(int i=1;i<numRows;i++){
            List<Integer> var = new ArrayList<>();
            List<Integer> previousRow = solution.get(i-1);
            var.add(1);
            for(int j=1;j<i;j++){
                
                var.add(previousRow.get(j-1)+previousRow.get(j));
                
            }
            var.add(1);
            solution.add(var);
                
            }
            
        return solution;
    }
}//https://leetcode.com/problems/pascals-triangle/
