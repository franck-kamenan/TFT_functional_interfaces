package be.technofuturtic.programmation_en_java.functional_interfaces;

//Consumer<T>
//public interface Consumer<T> {
//
//    public void accept(T t);
//}

import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {

        Consumer<String> consomation = (t) -> System.out.println("Je mange " + t);
        consomation.accept("des pommes.");
    }
}
