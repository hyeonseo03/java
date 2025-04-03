package week5;

import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		char grade;
		
		while(true)
		{
			System.out.println("점수 입력>>");
			score = sc.nextInt();
			
			if (score <0)
			{
				break;
			}
			
			if(score >=90) {
				grade = 'A';
			}
			else if(score >=80) {
				grade = 'B';
			}
			else if(score >=70) {
				grade = 'C';
			}
			else if(score >=60) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			System.out.println("Score\t\tGRADE");
			System.out.println("=========================");
			System.out.printf(" %d\t\t%c\n=" ,score,grade);
		}
		
		sc.close();	

	}

}
