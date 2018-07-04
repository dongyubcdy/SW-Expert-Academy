package D1;

import java.util.Scanner;

public class P1936 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		int B=sc.nextInt();

		switch(A) {
		case 1:
			if(B==2)
				System.out.println("B");
			else
				System.out.println("A");
			break;
		case 2:
			if(B==3)
				System.out.println("B");
			else
				System.out.println("A");
			break;
		case 3:
			if(B==1)
				System.out.println("B");
			else
				System.out.println("A");
			break;
			
			
		}

		
		sc.close();
	}

}
