package za.ac.cput.calculator;

public class Division {

    /**
     * Returns integer division result
     * @param numerator
     * @param denominator
     * @return
     */
    public static int integerDivision(int numerator, int denominator){
        if(denominator < 1) return 0;
        return numerator/denominator;
    }
}
