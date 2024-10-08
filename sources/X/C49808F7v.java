package X;

import java.io.IOException;

/* renamed from: X.F7v  reason: case insensitive filesystem */
public final class C49808F7v {
    public static DwA parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1B(A17)) {
                    r1.A03 = C41845B3m.A0a(r4, false);
                } else if ("suggested_users".equals(A17)) {
                    r1.A00 = C44753CkP.parseFromJson(r4);
                } else if (AnonymousClass000.A00(4177).equals(A17)) {
                    r1.A02 = C324396zD.parseFromJson(r4);
                } else if ("has_stories".equals(A17)) {
                    r1.A04 = AnonymousClass7TF.A0S(r4);
                } else {
                    1XY.A01(r4, r1, A17);
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
