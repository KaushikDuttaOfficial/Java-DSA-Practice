public class Power {
	public static int power(int x, int n){
	    if(n==0){
	        return 1;
	    }
	    if(x==0){
	        return 0;
	    }
	    int halfpower=power(x,n/2);
	    int halfpowersq=halfpower*halfpower;
	    if((n&1)!=0){
	        return x*halfpowersq;
	    }
	    return halfpowersq;
	}
	public static void main(String[] args) {
		int x=2, n=10;
		System.out.println(power(x,n));
	}
}
