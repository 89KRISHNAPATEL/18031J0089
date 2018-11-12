

import java.util.Scanner;

class Student1{
	int rollno;
	String sname;
	double tmarks;
	public Student1(int rollno, String sname, double tmarks) {
		this.rollno = rollno;
		this.sname = sname;
		this.tmarks = tmarks;
	}
	
}
class Node{
	Student key;
	int val;
	public Node right,left;
	Node(Student key,int val){
		this.key=key;
		this.val=val;
	}
}

public class BinarySearch {
	Node root;

	BinarySearch() {
		this.root = null;
	}

	public void put(Student key, int val) {
		root = put(root, key, val);
	}

	public Node put(Node node,Student key,int val ) {
		if(node==null) {
			return new Node(key,val);
		}
		if(key.rollno<node.key.rollno) {
			node.left=put(node.left,key,val);
		}
		else {
			node.right=put(node.right,key,val);
		}
		return node;
	}
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=Integer.parseInt(scn.nextLine());
		int l=1;
		BinarySearch bs=new BinarySearch();
		while(l<=n) {
			String s=scn.nextLine();
			String st[]=s.split(",");
			Student stn=new Student(Integer.parseInt(st[0]),st[1],Double.parseDouble(st[2]));
			bs.put(stn,1);
			n++;
		}
		int m=Integer.parseInt(scn.nextLine());
		int k=1;
		while(k<=m) {
			String ss=scn.nextLine();
			String s11[]=ss.split(" ");
			//Student sst=new Student(Integer.parseInt(),st[1],Double.parseDouble(st[2]))
			if(s11[0].equals("BE")) {
				
			}
		}
	}
	
}
