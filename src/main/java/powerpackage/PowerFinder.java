package powerpackage;
public class PowerFinder {
    public static int OF(int base, int Exponent) {
        int p = 1;
        for (int i = 0; i<Exponent; i++) {
            p *= base;
        }
        return p;
    }
}
