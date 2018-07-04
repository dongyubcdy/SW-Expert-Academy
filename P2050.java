package D1;

import java.util.Scanner;

public class P2050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String N=sc.nextLine();
		for(int i=0;i<N.length();i++) {
			int k=(int)N.charAt(i)-64;
		System.out.print(k+" ");
		}
	}

}
