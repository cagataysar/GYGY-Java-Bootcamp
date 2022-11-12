package main.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
//Anotasyonun ne zamana kadar geçerliliğini koruyacağını söyler.
@Target(value = { ElementType.METHOD, ElementType.TYPE })
//Bu anotasyonun nerelerde kullanılabileceğini belirtir.
public @interface Ciddiyet {

	public int level() default 1;

}
