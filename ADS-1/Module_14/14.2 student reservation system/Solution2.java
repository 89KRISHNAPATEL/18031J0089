

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student3
{
	String Name,DOB,sub1,sub2,sub3,total,Category;
	int merit;
	
	public Student3(String  Name, String DOB, String sub1, String sub2, String sub3,String total,int merit,String Category) {
		// TODO Auto-generated constructor stub
		this.Name=Name;
		this.DOB=DOB;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.total=total;
		this.merit=merit;
		this.Category=Category;
	}
}
public class Solution2 {
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		int vacancies=2,UR=1,BC=2,SC=1,ST=1;
		ArrayList<Student3> t=new ArrayList<Student3>();
		t.add(new Student3("Ajay","12-06-1993","32","33","11","76",95,"Open"));
		t.add(new Student3("priya","13-08-1993","21","40","11","72",85,"sc"));
		t.add(new Student3("rahul","22-10-1993","34","19","19","72",90,"BC"));
		t.add(new Student3("Abhishek","06-05-1993","18","37","15","70",64,"BC"));
		t.add(new Student3("Priyanaka","09-12-1993","18","37","15","70",54,"Open"));
		t.add(new Student3("vani","13-06-1993","11","23","16","50",75,"ST"));
		for(int i=0;i<t.size();i++) {
			for(int j=i;j>0;j--) {
				if(t.get(j-1).merit<t.get(j).merit) {
					Student3 temp = t.remove(j - 1);
					t.add(j, temp);
				}
			}
		}
		String ss=" "+t.get(0).Name+","+t.get(0).DOB+","+t.get(0).sub1+","+t.get(0).sub2+","+t.get(0).sub3+","+t.get(0).total+","+","+t.get(0).merit+","+t.get(0).Category;
		for(int i=1;i<t.size();i++) {
			ss=ss+", "+t.get(i).Name+","+t.get(i).DOB+","+t.get(i).sub1+","+t.get(i).sub2+","+t.get(i).sub3+","+t.get(i).total+","+","+t.get(i).merit+","+t.get(i).Category;
		}
		System.out.println(ss);
				
		/*int s=scan.nextInt();
		//System.out.println(s);
		while(scan.hasNext()) {
			String a =scan.nextLine();
			String b[]=a.split(",");
			//t.add(new Student1(b[0],b[1],b[2],b[3],b[4],b[5]));
			if(b.length<2)
			{
				
			}
			else
			{
				t.add(new Student1(b[0],b[1],b[2],b[3],b[4],b[5]));
			}
		}*/
		/*System.out.println("Before Sorting **8");
		show(t);
		*/
		sort(t);
		
		//show(t);
	}
	static void sort(ArrayList t)
	{
		
		sort(t,0,t.size()-1);
	}
	static void sort(ArrayList t1,int low,int high)
	{
		if(high<low)
			return;
		int pi=partition(t1,low,high);
		sort(t1,low,pi-1);
		sort(t1,pi+1,high);
	}
	static int partition(ArrayList t2,int low,int high)
	{
		
		Student3 temp=(Student3) t2.get(high);
		int i=low-1;
		for(int j=low;j<=high-1;j++)
		{
			Student3 v=(Student3) t2.get(j);
			if(compare(v,temp))
			{
				i++;
				Collections.swap(t2, i, j);
			}
		}
		Collections.swap(t2, i+1, high);
		return (i+1);
		
	}
	static boolean compare(Student3 v, Student3 temp) {
		if(v.total.compareTo(temp.total)==0)
		{
			if(v.sub3.compareTo(temp.sub3)==0)
			{
				if(v.sub2.compareTo(temp.sub2)==0)
				{
					if(v.DOB.compareTo(temp.DOB)>0)
						return true;
					else 
						return false;
				}
				else if(v.sub2.compareTo(temp.sub2)>0)
					return true;
				else
					return false;
					
			}
			else if(v.sub3.compareTo(temp.sub3)>0) 
				return true;
			
			else 
				return false;
		}
		else if(v.total.compareTo(temp.total)>0)
		{
			return true;
		}
			
		else 
		{
			return false;
		}
	}
	private static void show(ArrayList t3)
	{
		
	for(int k=0;k<=t3.size()-1;k++)
	{
		Student3 T2=(Student3) t3.get(k);
		System.out.println("["+T2.Name+","+T2.DOB+","+T2.sub1+","+T2.sub2+","+T2.sub3+","+T2.total+","+T2.Category+"]");
		
	}
	
		
	}
}
