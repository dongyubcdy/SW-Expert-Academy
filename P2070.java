package D1;

import java.util.Scanner;

public class P2070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++) {
			System.out.print("#"+t+" ");
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a<b) {
					System.out.println("<");
				}
				else if(a>b) {
					System.out.println(">");
				}
				else {
					System.out.println("=");
				}
		}
		sc.close();
	}
}
