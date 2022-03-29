package design.factoryupgrade;

public class Cat extends AbstractAnimal {

    @Override
    public String setName() {
        return "CAT";
    }

    @Override
    public void printDescription() {
        // TODO Auto-generated method stub
        System.out.println("고양이 입니다.~");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
    }

}

