package org.example;

import java.util.List;
import java.util.regex.Pattern;

public class Util {
    public static int convertRomanToArabic(String romanNumber){
        String romanNumeral = romanNumber.toUpperCase();
        boolean containsFourOrMoreSameCharacters = !Pattern.
                compile("^(?=[MDCLXVI])M{0,3}(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$").
                matcher(romanNumeral).find();
        if(containsFourOrMoreSameCharacters) {
            System.out.println("cannot be a Roman numeral or is not within the range of 1-3999");
            throw new IllegalArgumentException("cannot be a Roman numeral or is not within the range of 1-3999");
        } else {
            int result = 0;
            List<MashaNumber> romanNumerals = MashaNumber.getReverseList();
            int i = 0;
            while ((!romanNumeral.isEmpty()) && (i < romanNumerals.size())) {
                MashaNumber symbol = romanNumerals.get(i);
                if (romanNumeral.startsWith(symbol.name())) {
                    result += symbol.getValue();
                    romanNumeral = romanNumeral.substring(symbol.name().length());
                } else {
                    i++;
                }
            }
            if (!romanNumeral.isEmpty()) {
                throw new IllegalArgumentException(romanNumber + " cannot be a Roman numeral or is not within " +
                        "the range of 1-3999");
            }
            return result;
        }

    }
}
