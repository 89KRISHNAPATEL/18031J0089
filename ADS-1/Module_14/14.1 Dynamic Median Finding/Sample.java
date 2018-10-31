import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sample {
 public static void main(String args[]) {
	 Scanner scn=new Scanner(System.in);
	 ArrayList<Integer> al=new ArrayList<>();
	 int m=scn.nextInt();
	 for(int j=0;j<m;j++) {
		 al.add(scn.nextInt());
		 Collections.sort(al);
		 int i=al.size()-1;
		 double val=(i%2==0)?(double)al.get(i/2):(double)(al.get(i/2)+al.get((i/2)+1))/2;
		 System.out.println(val);
	 }
	/* int a[]= {1,2,3,4};
	 Arrays.sort(a);
	 int i=a.length-1;
	 double val=(i%2==0)?(double)a[i/2]:(double)(a[(i/2)]+a[(i/2)+1])/2;*/
	 //System.out.println(val);
 }
}
