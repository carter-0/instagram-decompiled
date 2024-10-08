package X;

import java.io.IOException;

/* renamed from: X.Nzm  reason: case insensitive filesystem */
public abstract class C70256Nzm {
    public static C66101jR parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C66101jR r1 = new C66101jR();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C66580MXl.A1Z(A17)) {
                    r1.A00 = C66580MXl.A0h(r3);
                } else if (AnonymousClass000.A00(3203).equals(A17)) {
                    r1.A01 = r3.A0d();
                } else {
                    C66670Mad.A01(r3, r1, A17);
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
