package main;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Çalışma zamanında korunması gerektiğini belirtir.
@Target(ElementType.METHOD) // Bu notasyonun sadece metotlar üzerinde kullanılabileceğini belirtir.
public @interface Test {

}
