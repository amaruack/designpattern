package Design;

/**
 * 파  일  명 :		Test06.java
 * 설       명 :		Design pattern - Strategy  예제
 * 작  성  자 :		손영준
 * 작성 일시 : 	2012.10.08
 * 
 * Mart는 멤버 변수로 Seller를 가집니다. Mart에서 가지는 Seller를 바꿔치기함으로써 Mart의 order()에서 실제 실행되는 로직이 달라질 수 있습니다.
 */

public class Test06 {
	
	public static void main(String[] args) {
		Seller cupSeller = new CupSeller();
		Seller phoneSeller = new PhoneSeller();
		Mart mart1 = new Mart(cupSeller);
		mart1.order();
		Mart mart2 = new Mart(phoneSeller);
		mart2.order();
	}
}

interface Seller {
	public void sell();
}

class CupSeller implements Seller{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("컵 팔아요");
	}
	
}

class PhoneSeller implements Seller{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("폰 팔아요");
	}
	
}

class Mart {
	private Seller seller ;
	public Mart(Seller seller) {
		this.seller = seller;
	}
	public void order(){
		seller.sell();
	}
}









