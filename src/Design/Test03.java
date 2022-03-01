package Design;

/**
 * ��  ��  �� :		Test02.java
 * ��       �� :		Design pattern - Factory Method ���� ����
 * ��  ��  �� :		�տ���
 * �ۼ� �Ͻ� : 	2012.10.05
 * 
 * Abstract class�� �������̽��� ���ؼ� �پ��� ���� ����ü�� ���� ��쿡 ����ϸ� �����ϴ�. ������ Factory.create(���ڴ� �����) �� ���� �˴ϴ�.
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
		System.out.println("����� �Դϴ�.~");
	}	
}

class Cow implements Animal{
	public void printDescription() {
		System.out.println("�ҿ� �Դϴ�.");
	}
}

class Dog implements Animal{
	public void printDescription(){
		System.out.println("������~");
	}
}

public class Test03 {
	public static void main(String[] args) {
	
		Animal a1 = AnimalFactory.create("Cat");
		a1.printDescription();
	}
}
