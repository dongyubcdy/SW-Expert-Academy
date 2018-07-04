package D1;

import java.util.Scanner;

public class P2068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++) {
			System.out.print("#"+t+" ");
			int max=0;
			for(int i=0;i<10;i++) {
				int k=sc.nextInt();
				if(max<k) {
					max=k;
				}
			}
			System.out.println(max);
		}
		sc.close();
	}

}
