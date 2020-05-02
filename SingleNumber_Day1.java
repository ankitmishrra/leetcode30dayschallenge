package practice.leetcode30days;

public class SingleNumber_Day1 {

	public static void main(String[] args) {
		SingleNumber_Day1 sn = new SingleNumber_Day1();
		int a[] = {1, 2, 3, 1, 2}; 
		
		
		System.out.println(sn.singleNumber(a));
	}
	
	public int singleNumber(int[] a) {
		for(int i=1; i<a.length; i++) {
			a[i]=a[i]^a[i-1];
		}
        return a[a.length-1];
    }
}
