package X;

import java.io.IOException;

/* renamed from: X.B7t  reason: case insensitive filesystem */
public final class C41942B7t {
    public static C41943B7u parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            1XP r3 = new C379749Vd();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("payload".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    r3.A02 = str;
                } else if ("layout".equals(A0q)) {
                    r3.A01 = C276404tH.A00(r5);
                } else {
                    1XY.A01(r5, r3, A0q);
                }
                r5.A0z();
            }
            C270864hR r0 = new C270044g6(r3.A01, r3.A02).A01;
            0qQ.A0B(r0, 0);
            r3.A00 = r0;
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
