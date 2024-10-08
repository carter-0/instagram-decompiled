package X;

import java.io.IOException;

/* renamed from: X.F4n  reason: case insensitive filesystem */
public final class C49748F4n {
    public static Dw6 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("media_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A04 = str;
                } else if ("megaphone".equals(A17)) {
                    r0.A02 = C48989EnR.parseFromJson(r3);
                } else if ("feed_item".equals(A17)) {
                    r0.A01 = 1Xg.A00(r3);
                } else if ("reel_item".equals(A17)) {
                    r0.A03 = AnonymousClass3HR.parseFromJson(r3);
                } else if ("suspected_sponsor".equals(A17)) {
                    r0.A00 = AnonymousClass534.parseFromJson(r3);
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
