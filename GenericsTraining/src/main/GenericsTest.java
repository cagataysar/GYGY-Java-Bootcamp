package main;

import java.util.ArrayList;
import java.util.List;

class AnimalGenerics {
	public void eat() {
		System.out.println("Animal eat");
	}
}

class DogGenerics extends AnimalGenerics {
	public void eat() {
		System.out.println("Dog eat");
	}
}

public class GenericsTest {

	public static void main(String[] args) {
		List<AnimalGenerics> animalList = new ArrayList<AnimalGenerics>();
		List<DogGenerics> dogList = new ArrayList<DogGenerics>();

		// List animalDogList = new ArrayList();
		// Derleme hatasi verir! Referans degisken olarak tanimliysa ,
		// new anahtar kelimesinden sonra olmalidir.

		genericsRules(animalList);
		// genericsRules(dogList);
		// dogList'i arguman olarak veremeyiz. Ilgili metot List tipinde
		// bir parametre almaktadir.
		// Dog IS-A Animal olsa da buraya List tipine bir degisken
		// gonderemeyiz !
	}

	public static void genericsRules(List<AnimalGenerics> myAnimals) {
		System.out.println("test");
	}

}
