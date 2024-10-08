package X;

import java.io.IOException;

/* renamed from: X.Nya  reason: case insensitive filesystem */
public abstract class C70182Nya {
    public static C65381c4 parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C65381c4 r1 = new C65381c4();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C66581MXm.A1X(r4, A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r1.A00 = str;
                } else if (AnonymousClass000.A00(3412).equals(A0q)) {
                    r1.A01 = r4.A0d();
                } else {
                    C66670Mad.A01(r4, r1, A0q);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
