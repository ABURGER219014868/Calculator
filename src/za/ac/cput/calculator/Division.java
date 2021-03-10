package za.ac.cput.calculator;

public class Division {

    public static int integerDivision(int numerator, int denominator){
        if(denominator < 1) return 0;
        return numerator/denominator;
    }
}
