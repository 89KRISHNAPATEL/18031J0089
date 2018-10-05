

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Stack<Integer> ss=new Stack<Integer>();
		String s1=scn.nextLine();
		String s2[]=s1.split(" ");
		int n=0;
		for(int i=0;i<s2.length;i++) {
			try {
				n=Integer.parseInt(s2[i]);
				ss.push(n);
			}catch(NumberFormatException e) {
				int v1=ss.pop();
				int v2=ss.pop();
				switch(s2[i].charAt(0)) {
				case '+':
					n=v1+v2;
					break;
				case '-' :
					n=v2-v1;
					break;
				case '*':
					n=v1*v2;
					break;
				case '/':
					n=v2/v1;
					break;
				}
				ss.push(n);
			}
		}
		System.out.println(ss.pop());
	}

}
