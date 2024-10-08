package X;

import java.io.IOException;

/* renamed from: X.NzA  reason: case insensitive filesystem */
public abstract class C70218NzA {
    public static C66491nb parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            C66491nb r1 = new C66491nb();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C41845B3m.A1A(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r1.A01 = str;
                } else if (AnonymousClass000.A00(1779).equals(A17)) {
                    r1.A00 = r5.A0y();
                } else {
                    C66893Meb.A01(r5, r1, A17);
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
