package week4;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("상품 구매 가격 입력 >>>");
		 int price = sc.nextInt();
		 
		 int rate = 0;
		 int finalAmt;
		 
		 if(price>=100000) {
			 rate = 10;
		 }
		 else if(price>=50000) {
			 rate = 5;
		 }
		//할인 금액 계산
		 int di = price * rate / 100;
		 finalAmt = price - di;
		 
		 System.out.println("원래 금액:" + price);
		 System.out.println("할인율:" + rate + "%");
		 System.out.println("최종가격:" + finalAmt + "원");
		 
		 
		 
		 sc.close();
	}

}
