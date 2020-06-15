import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
    	if (list == null || list.length < 2) return null;
    	int[] returnIndices = new int[2];
    	for(int i=0;i<list.length;i++) {
    		for(int j=0;i<list.length;i++) {
    			 if (list[i] != list[j]) {
    				 if(list[i]+list[j]==sum) {
    					 returnIndices[0]=i;
    					 returnIndices[1]=j;
    				 }
    				 
    		        }
        	}
    	}
    	
    	if(returnIndices[0]==0 && returnIndices[0]==0) {
    		return null;
    	} 
    	return returnIndices;
    }
    
    public static int[] findTwoSum2(int[] list, int sum) {
    	 Map<Integer, Integer> indexMap = new HashMap<>();
    	if (list == null || list.length < 2) return null;
    	for(int i=0;i<list.length;i++) {
    		 int needed = sum - list[i];
    		  if (indexMap.get(needed) != null) {
    	            return new int[]{i, indexMap.get(needed)};
    	        }
    		  
    		  indexMap.put(list[i], i);
    	}
    	
    	return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum2(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}