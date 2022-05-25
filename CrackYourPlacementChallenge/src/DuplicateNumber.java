import java.util.Arrays;

public class DuplicateNumber {
	
	public static int duplicateFind(int nums[]) {
		Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]) return nums[i];
        }
        return 0;
	}
	
	public static void main(String args[]) {
		
				int nums[] = {1,4,3,2,4};
		        System.out.println(duplicateFind(nums));
		        
	}
}
