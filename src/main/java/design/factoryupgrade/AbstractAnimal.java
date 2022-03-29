package design.factoryupgrade;

abstract class AbstractAnimal implements Animal {

    String name = null;
    Class<?> clazz = null;

    public AbstractAnimal(){
        this.name = this.setName();
        this.clazz = this.getClass();
        // class object 가 나을까 ,,, class name string 이 나을까 ..
        AnimalFactory.getInstance().setType(this.name, this.clazz);
    }

}

