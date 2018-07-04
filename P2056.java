package D1;

import java.util.Scanner;

public class P2056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++) {
			System.out.print("#"+t+" ");
			int k=sc.nextInt();
			int y=k/10000;
			int m=(k-y*10000)/100;
			String year=y<1000?"0"+Integer.toString(y):Integer.toString(y);
			int d=k%100;
			String month=m<10?"0"+Integer.toString(m):Integer.toString(m);
			String day=d<10?"0"+Integer.toString(d):Integer.toString(d);
			switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(0<d&&d<32) {
					System.out.println(year+"/"+month+"/"+day);
					}
				else
					System.out.println("-1");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(0<d&&d<31)
					System.out.println(year+"/"+month+"/"+day);
				else
					System.out.println("-1");
				break;
			case 2:
				if(0<d&&d<29)
					System.out.println(year+"/"+month+"/"+day);
				else
					System.out.println("-1");
				break;
			default:
				System.out.println("-1");
				break;
			}

		}
		sc.close();
	}

}
