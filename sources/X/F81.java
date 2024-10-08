package X;

import java.io.IOException;

public final class F81 {
    public static Dw4 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("is_email_legit".equals(A17)) {
                    r0.A02 = r3.A0d();
                } else if (C41845B3m.A1E(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("body".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("requires_code_confirmation".equals(A17)) {
                    r0.A03 = r3.A0d();
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
