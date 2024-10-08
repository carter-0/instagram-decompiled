package X;

import java.util.Arrays;

/* renamed from: X.Ej4  reason: case insensitive filesystem */
public abstract class C48719Ej4 {
    public static final String A00(String str) {
        String A00 = AnonymousClass000.A00(3871);
        if (str != null) {
            if (str.equals(A00)) {
                return A00;
            }
            if (!str.equals("emphasized")) {
                String format = String.format("Got unexpected button style: %s", Arrays.copyOf(new Object[]{str}, 1));
                0qQ.A07(format);
                1Kn.A02("BloksScreenNavbarButtonData", format);
            }
        }
        return "emphasized";
    }
}
