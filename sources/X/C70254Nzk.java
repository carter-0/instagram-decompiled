package X;

import java.io.IOException;

/* renamed from: X.Nzk  reason: case insensitive filesystem */
public abstract class C70254Nzk {
    public static C65921hr parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65921hr r0 = new C65921hr();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C66580MXl.A1Z(A17)) {
                    r0.A00 = C254733sx.parseFromJson(r3);
                } else if ("is_starred".equals(A17)) {
                    r0.A01 = r3.A0d();
                } else {
                    C66670Mad.A01(r3, r0, A17);
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
