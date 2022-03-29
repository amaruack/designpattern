package design.factoryupgrade;

class Cow extends AbstractAnimal  {
    @Override
    public String setName() {
        return "COW";
    }

    public void printDescription() {
        System.out.println("소오 입니다.");
    }
}

