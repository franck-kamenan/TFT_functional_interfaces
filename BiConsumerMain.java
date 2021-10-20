package be.technofuturtic.programmation_en_java.functional_interfaces;

//BiConsumer<T,U>
//public interface BiConsumer<T,U> {
//
//    public void accept(T t, U u);
//}

import java.util.function.BiConsumer;

public class BiConsumerMain {

    public static void main(String[] args) {

        BiConsumer<String, Integer> lui = (t, u) -> System.out.println(t + " a " + u + " ans.");
        lui.accept("Franck", 35);
    }
}
