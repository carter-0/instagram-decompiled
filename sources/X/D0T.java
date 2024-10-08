package X;

import java.io.IOException;

public final class D0T {
    public static C43874CGo parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            1XP r3 = new C379749Vd();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("payload".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    r3.A02 = str;
                } else if ("layout".equals(A17)) {
                    r3.A01 = R9S.A00(r5);
                } else {
                    1XY.A01(r5, r3, A17);
                }
                r5.A0z();
            }
            R9S r9s = r3.A01;
            String str2 = r3.A02;
            if (r9s == null) {
                if (str2 != null) {
                    r9s = (R9S) Ci2.parseFromJson(16P.A00(str2)).A00;
                    if (r9s == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            0qQ.A0B(r9s, 0);
            r3.A00 = r9s;
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
