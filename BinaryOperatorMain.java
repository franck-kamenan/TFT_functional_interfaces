package be.technofuturtic.programmation_en_java.functional_interfaces;

//BinaryOperator<T> extends BiFunction<T,T,T>
//public interface BinaryOperator<T> extends BiFunction<T,T,T> {
//
//    Herite de la methode R apply(T t, U u);
//}

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorMain {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> bibi = (t, u) -> t + u;
        Integer result = bibi.apply(2, 3);
        System.out.println(result);
        System.out.println(bibi.apply(4, 8));

        BinaryOperator<Integer> riri = (t, u) -> t - u;
        System.out.println(riri.apply(7, 5));
    }
}
