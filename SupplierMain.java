package be.technofuturtic.programmation_en_java.functional_interfaces;

//Supplier<T>
//public interface Supplier<T> {
//
//    public T get();
//}

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {

        Supplier<LocalDateTime> moment = () -> LocalDateTime.now();
        System.out.println(moment.get());

        Supplier<String> question = () -> "Que fais-tu?";
        System.out.println(question.get());
    }
}
