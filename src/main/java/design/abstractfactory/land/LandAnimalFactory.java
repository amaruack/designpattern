package design.abstractfactory.land;

import design.abstractfactory.Animal;
import design.abstractfactory.AnimalFactory;

class LandAnimalFactory extends AnimalFactory {

	@Override
	public Animal create(String animalName) {

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

