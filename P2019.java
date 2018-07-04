package D1;

import java.util.Scanner;

public class P2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int k=1;
		for(int i=0;i<=N;i++) {
			System.out.print(k+" ");
			k*=2;
		}
		
		sc.close();
	}

}
