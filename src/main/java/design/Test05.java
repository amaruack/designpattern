package design;

/**
 * ��  ��  �� :		Test05.java
 * ��       �� :		Design pattern - Singleton  ����
 * ��  ��  �� :		�տ���
 * �ۼ� �Ͻ� : 	2012.10.08
 * 
 */

public class Test05 {

	
}

//�̱��� ����  1
//������ ����
class Singleton1 {
	private static Singleton1 single = new Singleton1();
	public static Singleton1 getInstance(){
		return single;
	}
	private Singleton1(){		
	}
}

//�̱��� ���� 2
//���������� ������
class Singleton2 {
	private static Singleton2 single;
	public static synchronized Singleton2 getInstance(){
		if (single == null){
			single = new Singleton2();
		}		
		return single; 
	}
	private Singleton2(){		
	}
}

//�̱��� ���� 3
//volatile Ű���嵵 �� ����� �մϴ�. volatile Ű����� ������ ���ڼ��� �����մϴ�
//��Ƽ �����忡 �����ϴ� 
class Singleton3 {
	private volatile static Singleton3 single;
	
	public static Singleton3 getInstance(){
		if (single == null ){
			synchronized (Singleton3.class) {
				if (single == null){
					single = new Singleton3 ();
				}
			}
		}
		return single;
	}
	private Singleton3(){
		
	}
}

//��Ŭ�� ����4
//���� ��ü �̿� 
class Singleton4 {
	private Singleton4(){
		
	}
	private static class SingletonHolder{
		static final Singleton4 single = new Singleton4();
	}
	public static Singleton4 getInstance(){
		return SingletonHolder.single;
	}
}