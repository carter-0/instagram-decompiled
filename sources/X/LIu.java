package X;

import java.io.IOException;

public final class LIu {
    public static K1A parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            K1A k1a = new K1A();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("has_succeeded".equals(A17)) {
                    k1a.A00 = AnonymousClass7TF.A0S(r3);
                } else {
                    1XY.A01(r3, k1a, A17);
                }
                r3.A0z();
            }
            return k1a;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
