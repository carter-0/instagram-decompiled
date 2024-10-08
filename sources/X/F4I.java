package X;

import java.io.IOException;

public final class F4I {
    public static C47315Dui parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("totp_seed".equals(A17)) {
                    r4.A01 = AnonymousClass7TG.A0l(r5);
                } else if (Dbk.A01(10, 12, 97).equals(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            String str = r4.A01;
            0qQ.A0A(str);
            r4.A00 = new C47140DrH(str, r4.A02);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
