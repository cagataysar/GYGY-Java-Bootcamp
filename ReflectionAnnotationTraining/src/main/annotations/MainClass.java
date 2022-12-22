package main.annotations;

import java.util.ArrayList;
import java.util.Collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class MainClass {
	public static void main(String[] args) {
//		new Erkek().islem();
		new Erkek();
//		new Erkek().
	}
}

class Human {
	public void konus() {
		System.out.println("İnsan konuşuyor");
	}
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Ciddiyet(level = 6)
class Erkek extends Human {

//	Burada anotasyon kullanabilmek için @Target(value = ElementType.FIELD ) tanımlamak gerekir.
//	@Ciddiyet(level = 3)
	private int age;
	private String name;

	@SuppressWarnings({ "unused", "unchecked" })
	@Deprecated(since = "1.0.3", forRemoval = true)
	@Ciddiyet(level = 100)
	public void islem() {
		String str = "asdads";
		ArrayList<String> liste = (ArrayList<String>) Collections.EMPTY_LIST;
	}

	public void yeniIslem() {

	}

	@Override
	public void konus() {
		System.out.println("Erkek konuşuyor");
	}
}
