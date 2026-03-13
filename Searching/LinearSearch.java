public class LinearSearch {
	public static void main(String[] args) {
			int arr[] = {2,4,3,5,1};
			int n=5;
			boolean found = false;
			for(int i=0;i<arr.length;i++){
			    if(arr[i] == n){
			        System.out.println("Element found at index "+i);
			        found = true;
			        break;
			    }
			}
			if(!found){
			    System.out.println("Element not found");
			}
	}
}
