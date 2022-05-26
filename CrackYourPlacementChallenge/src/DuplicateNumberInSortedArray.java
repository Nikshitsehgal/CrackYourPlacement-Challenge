
public class DuplicateNumberInSortedArray {
	    public static int removeDuplicates(int[] nums) {
	        if(nums.length == 1) return 1;
	        
	        int replacementIndex = 1;
	        int currentIndex = 1;
	        
	        while(currentIndex < nums.length){
	            if(nums[currentIndex] != nums[currentIndex - 1]) {
	                nums[replacementIndex++] = nums[currentIndex];
	            }
	            currentIndex++;
	        }
	        
	        return replacementIndex;
	    }
	    
	    public static void main(String args[]) {
	    	int nums[] = {1,1,2};
	    	
	    	int k = removeDuplicates(nums);
	    	System.out.println(k);
	    }
}
