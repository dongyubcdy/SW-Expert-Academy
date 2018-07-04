package D1;

import java.util.Scanner;

public class P2058 {

	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int N=Integer.parseInt(sc.nextLine());
		S(N);
		
		System.out.println(sum);
		sc.close();
	}
	public static void S(int N) {
		if(N==0)
			return;
		sum+=N%10;
		S(N/10);
	}

}
