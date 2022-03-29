package design;

/**
 * ��  ��  �� :		Test06.java
 * ��       �� :		Design pattern - Strategy  ����
 * ��  ��  �� :		�տ���
 * �ۼ� �Ͻ� : 	2012.10.08
 * 
 * Mart�� ��� ������ Seller�� �����ϴ�. Mart���� ������ Seller�� �ٲ�ġ�������ν� Mart�� order()���� ���� ����Ǵ� ������ �޶��� �� �ֽ��ϴ�.
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
		System.out.println("�� �Ⱦƿ�");
	}
	
}

class PhoneSeller implements Seller{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("�� �Ⱦƿ�");
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









