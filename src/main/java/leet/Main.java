package leet;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrom(121));
        System.out.println(toArabInt("MMMCMXCIV"));
    }
    public static boolean isPalindrom(int x){
        String str = ("" + x).toString();
        StringBuilder sb = new StringBuilder(str);
        if(str.equals(sb.reverse().toString()))return true;
        else return false;
    }

    public static int toArabInt(String number){
        final  String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final  int[] DECIMAL_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int result = 0;
        String str = number;
        for (int i = 0; i < ROMAN_NUMERALS.length; i++){
            int decimalVal = DECIMAL_VALUES[i];
            String romanNumeralToCheck = ROMAN_NUMERALS[i];
            while (str.startsWith(romanNumeralToCheck)){
                result += decimalVal;
                str = str.substring(romanNumeralToCheck.length());
            }
        }
        return result;
    }

}
