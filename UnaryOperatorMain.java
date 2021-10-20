package be.technofuturtic.programmation_en_java.functional_interfaces;

//UnaryOperator<T> extends Function<T, T>
//public interface UnaryOperator<T> extends Function<T, T> {
//
//    Herite de la methode R apply(T t);
//}

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorMain {

    public static void main(String[] args) {

        Function<Integer, Integer> unity = (t) -> t * 2;
        Integer result = unity.apply(7);
        System.out.println(result);
        System.out.println(unity.apply(4));

        UnaryOperator<Integer> trinity = (t) -> t * 3;
        System.out.println(trinity.apply(3));

    }
}
