package design.abstractfactory;

/**
 * 파  일  명 :		Test02.java
 * 설       명 :		Design pattern - Factory Method 패턴 예제
 * 작  성  자 :		mr.son
 * 작성 일시 : 	2012.10.05
 * 
 * Abstract class나 인터페이스에 대해서 다양한 하위 구현체가 있을 경우에 사용하면 좋습니다. 사용법은 Factory.create(인자는 맘대로) 와 같이 됩니다.
 */

public interface Animal {
	public void printDescription();
}

