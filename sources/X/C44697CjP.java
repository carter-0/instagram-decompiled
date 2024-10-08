package X;

import java.io.IOException;

/* renamed from: X.CjP  reason: case insensitive filesystem */
public abstract class C44697CjP {
    public static C65341bt parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C65341bt r1 = new C65341bt();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(2964).equals(A17)) {
                    r1.A00 = C44664Cii.parseFromJson(r3);
                } else if ("invite_source".equals(A17)) {
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
