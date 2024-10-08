package X;

import java.io.IOException;

public final class F8L {
    public static Dw5 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Dw5 dw5 = new Dw5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("mes_status".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    dw5.A00 = A0l;
                } else if ("is_temporarily_demonetized".equals(A17)) {
                    dw5.A03 = r4.A0d();
                } else if (AnonymousClass000.A00(3153).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    dw5.A01 = A0l2;
                } else if ("has_onboarded_milestone_incentives".equals(A17)) {
                    dw5.A02 = r4.A0d();
                } else {
                    1XY.A01(r4, dw5, A17);
                }
                r4.A0z();
            }
            return dw5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
