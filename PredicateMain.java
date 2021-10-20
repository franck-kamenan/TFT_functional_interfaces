package be.technofuturtic.programmation_en_java.functional_interfaces;

//Predicate<T>
//public interface Predicate<T> {
//
//    public boolean test(T t);
//}

import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {

        Predicate<Integer> trueOrFalse = (t) -> t == 5;
        System.out.println(trueOrFalse.test(4));
        System.out.println(trueOrFalse.test(5));

        System.out.println();

        Predicate<String> taille = (t) -> t.equals("petit");
        System.out.println(taille.test("Petit"));
        System.out.println(taille.test("petit"));
        System.out.println(taille.test("grand"));
    }
}
