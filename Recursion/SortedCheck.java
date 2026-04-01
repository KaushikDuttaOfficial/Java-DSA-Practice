public class SortedCheck {
	public static boolean sortedcheck(int i, int arr[]){
	    if(i==arr.length-1){
	        return true;
	    }
	    if(arr[i]<arr[i+1]){
	        return sortedcheck(i+1,arr);
	    }
	    return false;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		boolean b=sortedcheck(0,arr);
		if(b){
		    System.out.println("Sorted (Strictly Increasing Array)");
		}
		else{
		    System.out.println("Not Sorted");
		}
	}
}
