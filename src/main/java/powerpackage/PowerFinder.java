package powerpackage;
public class PowerFinder {
    public static int power(int base, int Exponent) {
        int prod = 1;
        for (int i= 0; i<Exponent; i++) {
            prod *= base;
        }
        return prod;
    }
}
