package week3;

public class ProductPrice {

	public static void main(String[] args) {
		int m_cnt = 1;
		int m_pr = 4500;
		
		int c_cnt = 3;
		int c_pr = 1000;
		
		int s_cnt = 2;
		int s_pr = 1500;
		
		int total = m_cnt * m_pr;
		total += c_cnt * c_pr;
		total += s_cnt * s_pr;
		
		System.out.println("할인 전 가격:"+total);
		
		
		//할인 금액 : 10% => 10/100 = 0.1
		
		double discount = total * 0.1;
		System.out.println("할인 금액:"+discount);
		
		double final_amt = total - discount;
		System.out.println("할인 금액:"+ final_amt);
	}

}
