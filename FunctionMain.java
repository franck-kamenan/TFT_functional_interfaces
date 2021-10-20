package be.technofuturtic.programmation_en_java.functional_interfaces;

//Function<T,R>
//public interface Function<T,R> {
//
//    public <R> apply(T t);
//}

import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {

        Function<Integer, Integer> addition = new PlusTroisCS();
        Integer resultat = addition.apply(5);
        System.out.println(resultat);
        System.out.println(addition.apply(8));

        Function<Integer, Integer> autreAddition = (t) -> 3 + t;
        System.out.println(autreAddition.apply(8));

        Function<String, String> moi = new PrenomCS();
        System.out.println(moi.apply("Franck."));

        Function<String, String> qui = (t) -> "C'est " + t + " le plus fort.";
        System.out.println(qui.apply("Blade"));
    }
}
