package X;

import java.io.IOException;

/* renamed from: X.Cjw  reason: case insensitive filesystem */
public abstract class C44728Cjw {
    public static C298805u4 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C298805u4 r0 = new C298805u4();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1D(A17)) {
                    r0.A01 = 1Xj.A00(r3);
                } else if ("contextual_item".equals(A17)) {
                    r0.A00 = C44726Cju.parseFromJson(r3);
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
