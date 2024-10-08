package X;

import java.io.IOException;

public final class F4W {
    public static C47320Dun parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("two_factor_info".equals(A17)) {
                    r3.A01 = C48360EdH.parseFromJson(r4);
                } else if ("two_factor_required".equals(A17)) {
                    r3.A02 = r4.A0d();
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            C47161Drc drc = r3.A01;
            0qQ.A0A(drc);
            r3.A00 = new C47145DrM(drc, r3.A02);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
