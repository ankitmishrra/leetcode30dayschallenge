package practice.leetcode30days;

public class PerformingStringShifts {
	public static void main(String[] args) {
		PerformingStringShifts pss = new PerformingStringShifts();
		String s="abcde";
		int [] [] shift = {{0,4}};
		System.out.println(pss.stringShift(s, shift));
	}
	
public String stringShift(String s, int[][] shift) {
        String s1 = s+s;
        int l= s.length();
       if(shift.length==0 || s.isEmpty()) {return s;}
        int i=0,j=l-1;
        for(int y=0;y<shift.length;y++) {
        	if(shift[y][0]==0) {
        		i+=shift[y][1];
        		i =i%l;
        		j=i+l-1;
        	}else {
        		i = i-(shift[y][1]%l); 
        		i= i>0?i:l+i;
        		j=i+l-1;
        	}
        }
        
	return s1.substring(i,j+1);
    }
}
