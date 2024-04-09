package zipcode;
//
public class Hamming {
    String s;
    String s1;
    public Hamming(String s, String s1) {
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else {
            this.s = s;
            this.s1 = s1;
        }
    }

    public int getHammingDistance() {
        return -1;
    }
}
