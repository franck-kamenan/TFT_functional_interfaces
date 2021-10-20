package be.technofuturtic.programmation_en_java.functional_interfaces;

import java.util.function.Function;

public class PrenomCS implements Function<String, String> {

    @Override
    public String apply(String donnerPrenom) {

        return "Je suis " + donnerPrenom;
    }
}
