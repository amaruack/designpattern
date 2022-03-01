package Design;

/**
 * 파  일  명 :		Test04.java
 * 설       명 :		Design pattern - Template Method패턴 예제
 * 작  성  자 :		손영준
 * 작성 일시 : 	2012.10.05
 * 
 * 형판
 *  Template Method에서는 전반적인 구현은 상위클래스(주로 Abstract로 만듭니다.)에서 담당하고 부분적인 곳의 구체적인 구현은 하위클래스가 담당합니다.
 */

abstract class Worker {
	protected abstract void doit ();
	public final void work(){
		System.out.println("출근");
		doit();
		System.out.println("퇴근");
	}
}

class Designer extends Worker {
	protected void doit(){
		System.out.println("열심히 디자인");
	}
}

class Gamer extends Worker {
	protected void doit(){
		System.out.println("열심히 게임");
	}
}

public class Test04 {

	public static void main(String[] args) {
		Worker designer = new Designer();
		designer.doit();
	}
	
	
}
