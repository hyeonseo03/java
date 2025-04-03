package week5;

import java.util.Scanner;

public class re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 몇 단을 계산할까?");
		
		int scanData = sc.nextInt();
		
		int i= 0;
		
		for (i=1;i<10;i++)
		{
			System.out.printf("%d * %d = %d \n",scanData,i,scanData*i);
		}
			
		
		sc.close();

	}

}
