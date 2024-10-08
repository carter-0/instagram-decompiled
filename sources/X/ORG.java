package X;

import java.io.IOException;

public final class ORG {
    public static NHN parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("error".equals(A17)) {
                    r1.A01 = C70337O2p.parseFromJson(r3);
                } else if ("response_content".equals(A17)) {
                    r1.A02 = C49145EqC.parseFromJson(r3);
                } else if (AnonymousClass000.A00(1676).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r1.A03 = str;
                } else if ("media".equals(A17)) {
                    r1.A00 = 1Xj.A00(r3);
                } else {
                    1XY.A01(r3, r1, A17);
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
