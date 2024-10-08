package X;

import java.util.List;

public abstract class LQE {
    public static final List A00 = 0sr.A1P(new Character[]{'$', '@', '#', '%', '&', '*'});

    public static final boolean A01(String str) {
        0qQ.A0B(str, 0);
        if (!00l.A0W(str)) {
            int i = 0;
            while (i < str.length()) {
                if (A00.contains(Character.valueOf(str.charAt(i)))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public static final String A00(int i) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (i < 4) {
            i = 4;
        }
        int i2 = 0;
        do {
            A1A.append(((Character) JTT.A0m(A00, i2)).charValue());
            i2++;
        } while (i2 < i);
        return DbT.A10(A1A);
    }
}
