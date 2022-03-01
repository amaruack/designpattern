package Design;

/**
 * 파  일  명 :		Test02.java
 * 설       명 :		Design pattern - Factory Method 패턴 예제
 * 작  성  자 :		손영준
 * 작성 일시 : 	2012.10.05
 * 
 * Abstract class나 인터페이스에 대해서 다양한 하위 구현체가 있을 경우에 사용하면 좋습니다. 사용법은 Factory.create(인자는 맘대로) 와 같이 됩니다.
 */

interface Animal{
	public void printDescription();
}

class AnimalFactory {
	public static Animal create(String animalName) {
		if(animalName == null){
			throw new IllegalArgumentException("no null");
		}
		if (animalName.equals("Cow")){
			return new Cow();
		} else if (animalName.endsWith("Cat")) {
			return new Cat();
		} else if (animalName.equals("Dog")) {
			return new Dog();
		} else {
			return null;
			
		}
		
	}
}

class Cat implements Animal{

	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		System.out.println("고양이 입니다.~");
	}	
}

class Cow implements Animal{
	public void printDescription() {
		System.out.println("소오 입니다.");
	}
}

class Dog implements Animal{
	public void printDescription(){
		System.out.println("개에에~");
	}
}

public class Test03 {
	public static void main(String[] args) {
	
		Animal a1 = AnimalFactory.create("Cat");
		a1.printDescription();
	}
}
