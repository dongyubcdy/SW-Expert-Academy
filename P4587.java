package D1;

import java.util.*;
public class P4587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int T=Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++) {
			System.out.print("#"+t+" ");
			int sum=0;
			for(int i=0;i<10;i++) {
				int k=sc.nextInt();
				if(k%2==1) {
					sum+=k;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
