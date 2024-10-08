package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class JZ9 {
    public static final List A00(String str) {
        JZ8 jz8;
        List<String> A0Q = 00l.A0Q(str, new char[]{','}, 0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (String A0B : A0Q) {
            try {
                String upperCase = 00l.A0B(A0B).toString().toUpperCase(Locale.ROOT);
                0qQ.A07(upperCase);
                jz8 = JZ8.valueOf(upperCase);
            } catch (Throwable th) {
                jz8 = new 0eQ(th);
            }
            if (jz8 instanceof 0eQ) {
                jz8 = null;
            }
            if (jz8 != null) {
                A1C.add(jz8);
            }
        }
        return A1C;
    }
}
