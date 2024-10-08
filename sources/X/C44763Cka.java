package X;

import java.io.IOException;

/* renamed from: X.Cka  reason: case insensitive filesystem */
public abstract class C44763Cka {
    public static C45288Ctr parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C45288Ctr ctr = new C45288Ctr();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("tagline".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    ctr.A01 = str;
                } else if ("photo".equals(A17)) {
                    ctr.A00 = C44762CkZ.parseFromJson(r3);
                }
                r3.A0z();
            }
            return ctr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
