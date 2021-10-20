package be.technofuturtic.programmation_en_java.functional_interfaces;

import java.util.function.Function;

public class TextMain {

    public static void main(String[] args) {

        WordFilterIF salutation = (s) -> "Bon" + s;
        System.out.println(salutation.matin("jour"));

        MyFunctionalInterfaceIF myLambda = () -> System.out.println("Executing...");
        myLambda.execute();

        Function<Integer, Integer> addition = new PlusTroisCS();
        Integer resultat = addition.apply(5);
        System.out.println(resultat);
        System.out.println(addition.apply(8));

        Function<Integer, Integer> autreAddition = (entier) -> 3 + entier;
        System.out.println(autreAddition.apply(8));

        Function<String, String> moi = new PrenomCS();
        System.out.println(moi.apply("Franck."));

        Function<String, String> qui = (s) -> "C'est " + s + " le plus fort.";
        System.out.println(qui.apply("Blade"));

    }
}
