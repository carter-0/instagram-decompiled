package X;

import java.io.IOException;

/* renamed from: X.Cji  reason: case insensitive filesystem */
public abstract class C44714Cji {
    public static C65681fm parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C65681fm r1 = new C65681fm();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(1839).equals(A17)) {
                    r1.A00 = C45674D0z.parseFromJson(r3);
                } else if (AnonymousClass000.A00(4038).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r1.A01 = str;
                } else {
                    C66893Meb.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
