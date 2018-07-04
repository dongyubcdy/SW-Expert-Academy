package D1;

import java.util.Scanner;

public class P2047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String N=sc.nextLine();
		
		for(int i=0;i<N.length();i++) {
			if(Character.isLowerCase(N.charAt(i))) {
				System.out.print(Character.toUpperCase(N.charAt(i)));
			}
			else {
				System.out.print(N.charAt(i));
			}
		}
		
		sc.close();
	}
}
