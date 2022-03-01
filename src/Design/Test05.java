package Design;

/**
 * 파  일  명 :		Test05.java
 * 설       명 :		Design pattern - Singleton  예제
 * 작  성  자 :		손영준
 * 작성 일시 : 	2012.10.08
 * 
 */

public class Test05 {

	
}

//싱글톤 예제  1
//성능이 좋다
class Singleton1 {
	private static Singleton1 single = new Singleton1();
	public static Singleton1 getInstance(){
		return single;
	}
	private Singleton1(){		
	}
}

//싱글톤 예제 2
//안전하지만 느리다
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

//싱글톤 예제 3
//volatile 키워드도 꼭 써줘야 합니다. volatile 키워드는 변수의 원자성을 보장합니다
//멀티 쓰레드에 안전하다 
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

//싱클톤 예제4
//내부 객체 이용 
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