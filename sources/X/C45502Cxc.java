package X;

import java.io.IOException;

/* renamed from: X.Cxc  reason: case insensitive filesystem */
public final class C45502Cxc {
    public static C43787CDf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("blocked_accounts".equals(A17)) {
                    r3.A02 = CUU.parseFromJson(r4);
                } else if ("blocked_categories".equals(A17)) {
                    r3.A01 = CUQ.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            C61093Jx4 jx4 = r3.A02;
            0qQ.A0A(jx4);
            C47188Dsa dsa = r3.A01;
            0qQ.A0A(dsa);
            r3.A00 = new C47186DsY(dsa, jx4);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
