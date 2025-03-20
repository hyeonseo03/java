package week3;

public class ScoreCalculator {
public static void main(String[] args) {
	int score = 50;
	System.out.println("초기점수: "+ score);
	
	score +=10;
	System.out.println("정답 보너스(+10): "+ score);
	
	score -=5;
	System.out.println("정답 보너스(-5): "+ score);
	
	score *= 2;
	System.out.println("추가점수(+1): "+ score);
	
	score++;
	System.out.println("감점(-1): "+ score);
	
	score--;
	System.out.println("최종점수: "+ score);
}
}
