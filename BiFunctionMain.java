package be.technofuturtic.programmation_en_java.functional_interfaces;

//BiFunction<T,U,R>
//public interface BiFunction<T,U,R> {
//
//    public <R> apply(T t, U u);
//}

import java.util.function.BiFunction;

public class BiFunctionMain {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> quoi = (t, u) -> t + u;
        System.out.println(quoi.apply(4, 5));
    }
}
