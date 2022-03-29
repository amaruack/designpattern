package design;

/**
 * ��  ��  �� :		Test04.java
 * ��       �� :		Design pattern - Template Method���� ����
 * ��  ��  �� :		�տ���
 * �ۼ� �Ͻ� : 	2012.10.05
 * 
 * ����
 *  Template Method������ �������� ������ ����Ŭ����(�ַ� Abstract�� ����ϴ�.)���� ����ϰ� �κ����� ���� ��ü���� ������ ����Ŭ������ ����մϴ�.
 */

abstract class Worker {
	protected abstract void doit ();
	public final void work(){
		System.out.println("���");
		doit();
		System.out.println("���");
	}
}

class Designer extends Worker {
	protected void doit(){
		System.out.println("������ ������");
	}
}

class Gamer extends Worker {
	protected void doit(){
		System.out.println("������ ����");
	}
}

public class Test04 {

	public static void main(String[] args) {
		Worker designer = new Designer();
		designer.doit();
	}
	
	
}
