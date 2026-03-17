public class FibonacciSeries {
	public static void printFibonacci(int n,int a,int b)
	{
	    if(n<=0){
	        return;
	    }
	    int c=a+b;
	    System.out.println(c);
	    printFibonacci(n-1,b,c);
	}
	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		System.out.println(a+"\n"+b);
		printFibonacci(n-2,a,b);
	}
}
