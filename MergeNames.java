import java.util.HashSet;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
    	
    	HashSet<String> removeDuplicates= new HashSet<>();
    	for(String ech:names1){
    		removeDuplicates.add(ech);
    	}
    	for(String ech:names2){
    		removeDuplicates.add(ech);
    	}
    	String[] returnArray = new String[removeDuplicates.size()];
    	removeDuplicates.toArray(returnArray);
    
    	return returnArray;
    	
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2)));
    }
}