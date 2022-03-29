package design.factoryupgrade;

class Dog extends AbstractAnimal  {
    @Override
    public String setName() {
        return "DOG";
    }

    public void printDescription() {
        System.out.println("개에에~");
    }
}

