public class CalculatePower {
	public static int calcPower(int x, int n){
	    if(n==0){
	        return 1;
	    }
	    return x*calcPower(x,n-1);
	}
	public static void main(String[] args) {
		int x=2, n=10;
		System.out.println(calcPower(x,n));
	}
}
