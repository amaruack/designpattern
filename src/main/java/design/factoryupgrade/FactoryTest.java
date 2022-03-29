package design.factoryupgrade;

public class FactoryTest {

    public static void main(String[] args) {

        try {

            AnimalFactory.getInstance().init("design.factoryupgrade");

            Cow cow = (Cow) AnimalFactory.getInstance().create(AnimalConstance.ANIMAL_TYPE.COW);

            cow.printDescription();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
