package X;

import java.io.IOException;

/* renamed from: X.CyC  reason: case insensitive filesystem */
public final class C45538CyC {
    public static CD2 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1D(A17)) {
                    r2.A01 = 1Xj.A00(r3);
                } else {
                    1XY.A01(r3, r2, A17);
                }
                r3.A0z();
            }
            1Xj r1 = r2.A01;
            0qQ.A0A(r1);
            r2.A00 = new C42025BEa(r1);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
