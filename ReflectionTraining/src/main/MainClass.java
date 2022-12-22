package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainClass {

	public static void main(String[] args) {
		/**
		 * Reflection(yansıma), Java Sanal Makinesinde çalışan uygulamaların, çalışma
		 * zamanındaki davranışlarını inceleme ve bu davranışlara yön verme imkanı
		 * sağlayan bir özelliktir. java.lang.reflect API'sinde tanımlanan reflection
		 * özelliği, hata ayıklama(debugging) ve test araçlarında, görsel yazılım
		 * geliştirme ortamlarında kullanılmaktadır.
		 */

		try {

			Class<?> newClass = Class.forName("main.Metallica");
			Object obj = newClass.newInstance();
//			Object obj2 = newClass.getDeclaredConstructor(String.class, Integer.TYPE);
			Constructor<?> cons = newClass.getDeclaredConstructor(String.class, Integer.TYPE);

			for (Field fields : newClass.getDeclaredFields()) {
				System.out.println("Field: " + fields.getName());
			}
			System.out.println("The part1 is over.");
			System.out.println();

			System.out.println("Modifiers: " + cons.getModifiers());
			int modifier = cons.getModifiers();
			System.out.println("Modifier: " + java.lang.reflect.Modifier.toString(modifier));

			System.out.println();

			System.out.println(cons.getName());
			System.out.println(cons.getParameterCount());
			System.out.println("isAccessible: " + cons.isAccessible());
			System.out.println("isSynthetic: " + cons.isSynthetic());
			System.out.println(cons.isVarArgs());

			System.out.println("The part2 is over.");
			System.out.println();

			Method setAgeMethod = newClass.getMethod("setVocalAge", Integer.TYPE);
			setAgeMethod.invoke(obj, 27);

			Method getAgeMethod = newClass.getMethod("getVocalAge");
			Object age = getAgeMethod.invoke(obj);
			System.out.println("Yaş: " + age);

			Method printPerson = newClass.getMethod("printPersonCount");
			printPerson.invoke(null);

//			Method increaseAgeMethod = newClass.getMethod("increaseAge");
//			increaseAgeMethod.setAccessible(true);
//			increaseAgeMethod.invoke(obj);

			Method toStringMethod = newClass.getMethod("toString");
			Object dataObject = toStringMethod.invoke(obj);
			System.out.println("Person: " + dataObject);

		} catch (ClassNotFoundException e) {
			System.out.print("The class not found: ");
			System.out.println(e.getMessage());
		} catch (InstantiationException e) {
			System.err.print("The object can not be instantiated from the class: ");
			System.err.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.err.print("illegal access to method");
			System.err.println(e.getMessage());
		} catch (NoSuchMethodException e) {
			System.err.print("No Such Method as ");
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.print("an illegal argument passing the method ");
			System.err.println(e.getMessage());
		} catch (InvocationTargetException e) {
			System.err.print("an invocation error ");
			System.err.println(e.getMessage());
		}
	}
}
