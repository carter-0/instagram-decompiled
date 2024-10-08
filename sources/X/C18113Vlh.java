package X;

import java.io.IOException;

/* renamed from: X.Vlh  reason: case insensitive filesystem */
public final class C18113Vlh {
    public static C15235UWu parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("log_soft_error".equals(A17)) {
                    r2.A01 = AnonymousClass7TF.A0S(r3);
                } else {
                    1XY.A01(r3, r2, A17);
                }
                r3.A0z();
            }
            r2.A00 = new UMy(C41845B3m.A14(r2.A01));
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
