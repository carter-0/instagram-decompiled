package X;

import java.util.List;

/* renamed from: X.KuW  reason: case insensitive filesystem */
public abstract class C63287KuW {
    public static final LDC A00(String str) {
        if (str.length() <= 0) {
            return null;
        }
        List A0x = DbX.A0x(str);
        if (A0x.size() != 3) {
            return null;
        }
        String A1G = C51966G9m.A1G(A0x, 0);
        String A1G2 = C51966G9m.A1G(A0x, 1);
        String A1G3 = C51966G9m.A1G(A0x, 2);
        if (A1G == null || A1G2 == null || A1G3 == null) {
            return null;
        }
        return new LDC(A1G, A1G2, A1G3);
    }
}
