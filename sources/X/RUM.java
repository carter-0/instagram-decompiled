package X;

public abstract class RUM {
    public static final String A00(String str) {
        String A0s = Pxj.A0s(str);
        if (A0s.length() != 15 || C11098S9z.A01(A0s)) {
            return str;
        }
        int i = 48;
        do {
            String A0C = 002.A0C(A0s, (char) i);
            if (C11098S9z.A01(A0C)) {
                return A0C;
            }
            i++;
        } while (i <= 57);
        return str;
    }
}
