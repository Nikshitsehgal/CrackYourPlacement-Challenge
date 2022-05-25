
public class SortColors {

	public static void sortColors(int[] nums) {
	    int n = nums.length;
	    for (int i = 0; i < n - 1; i++){
	        for (int j = 0; j < n - i - 1; j++){
	            if (nums[j] > nums[j + 1]) {
	                int temp = nums[j];
	                nums[j] = nums[j + 1];
	                nums[j + 1] = temp;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,0,2,1,2,0,1};
		sortColors(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
