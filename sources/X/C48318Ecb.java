package X;

/* renamed from: X.Ecb  reason: case insensitive filesystem */
public abstract class C48318Ecb {
    public static final String A00(16F r4) {
        if (r4.A11() == 16L.A0D) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            while (r4.A1J() != 16L.A09) {
                if (r4.A1J() == 16L.A0C) {
                    while (r4.A1J() != 16L.A08) {
                        A1A.append(r4.A1P());
                        A1A.append("\n");
                    }
                } else if (r4.A11().A03) {
                    A1A.append(r4.A1P());
                    A1A.append("\n");
                } else {
                    r4.A0z();
                }
            }
            return DbV.A12(DbT.A10(A1A));
        }
        r4.A0z();
        return null;
    }
}
