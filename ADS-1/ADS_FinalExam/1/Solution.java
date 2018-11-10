package pc_5;

import java.util.HashMap;
import java.util.Scanner;


class Student{
	int rollno;
	String sname;
	double tmarks;
	public Student(int rollno,String sname,double tmarks) {
		this.rollno=rollno;
		this.sname=sname;
		this.tmarks=tmarks;
	}
	@Override
	public String toString() {
		return rollno + ", " + sname + ", " + tmarks;
	}
}


public class Solution {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		HashMap<Integer,Student> hs=new HashMap<>();
		int n=Integer.parseInt(scn.nextLine());
		int k=1;
		while(k<=n) {
			String s1=scn.nextLine();
			String s2[]=s1.split(",");
			Student st=new Student(Integer.parseInt(s2[0]),s2[1],Double.parseDouble(s2[2]));
			hs.put(1 ,st);
			k++;
		}
		//System.out.println("hi");
		//System.out.println(hs);
		int m=Integer.parseInt(scn.nextLine());
		int l=1;
		while(l<=m)
		{
			String output = scn.nextLine();
			String d2[]=output.split(" ");
			if (d2[0].equals("get")) {
				if(Integer.parseInt(d2[2])==1) {
					System.out.println(hs.get(d2[1]).rollno);
				}
			}
			k++;
		}
		System.out.println(" ");
	}
}
	
