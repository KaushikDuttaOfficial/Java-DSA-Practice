public class BinarySearch {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=4;
		int start=0,end=arr.length-1;
		boolean notFound=true;
		while(start<=end){
		    int mid=start+(end-start)/2;
		    if(n==arr[mid]){
		        System.out.println("Found at index "+mid);
		        notFound=false;
		    break;
		    }
		    else if(n<arr[mid]){
		        end=mid-1;
		    }
		    else{
		        start=mid+1;
		    }
		}
		if(notFound){
		    System.out.println("Element not found");
		}
	}
}
