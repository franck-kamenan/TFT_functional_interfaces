package be.technofuturtic.programmation_en_java.functional_interfaces;

import java.util.function.Function;

public class PlusTroisCS implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer entier){

        return entier + 3;
    }
}
