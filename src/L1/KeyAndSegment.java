package L1;
/*
 Given an array check if the given number exists in the array within the specified segment.
 Input : 
 arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
 x = 3 (search number)
 k = 3 (segment)
 Output: Yes 
 Conditions : Segment OverLapping not allowed 
 */
public class KeyAndSegment {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3,1}; 
		int k=3;
		int x=3;
		int l=0;
		for(int i=0;i<arr.length;i=i+k) {
			l=i+k;
			if(i+k>arr.length) {
				l=arr.length;
			}			
			for(int j=i;j<l;j++) {
				if(arr[j]==x) {
					System.out.println(true);
				}
			}
		}
	}
}
