package L1;
/*
 * Get Min Max of a array using recursion
 * 
 */
public class MinMaxinArray {
	
	public static void main(String args[]) {
		int a[]=new int[] {1,2,-1,0};
		System.out.println(getMin(a,0,a.length));
	}
	
	public static int getMin(int a[],int i,int n) {
		System.out.println("In Min"+ a[i]);
		return (n==1)?a[i]:Math.min(a[i], getMin(a,i+1,n-1));
	}
}
