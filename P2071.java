package D1;

import java.util.Scanner;

public class P2071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++) {
			System.out.print("#"+t+" ");
			int sum=0;
			for(int i=0;i<10;i++) {
				int k=sc.nextInt();
				sum+=k;
			}
			if(sum%10>=5) {
				sum+=5;
			}
			System.out.println(sum/10);
		}
		sc.close();
	}

}
