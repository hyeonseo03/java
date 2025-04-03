package week5;

public class Gugudanall {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		for (i=2;i<=9;i++)
		{
			System.out.printf("%d 단 출력\n",i);
			for (j=1;j<=9;j++)
			{
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			System.out.println();
		}

	}

}
