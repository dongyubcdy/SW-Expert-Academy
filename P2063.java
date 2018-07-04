package D1;

import java.util.ArrayList;
import java.util.Scanner;

public class P2063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=Integer.parseInt(sc.nextLine());
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=N;i++) {
			int k=sc.nextInt();
			list.add(k);
		}
		list.sort(null);
		
		System.out.println(list.get((N-1)/2));
		sc.close();
	}

}
