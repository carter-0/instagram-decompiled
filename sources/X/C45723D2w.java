package X;

import java.io.IOException;

/* renamed from: X.D2w  reason: case insensitive filesystem */
public final class C45723D2w {
    public static CHX parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XO r2 = new 1XO();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("media_count".equals(A17)) {
                    r3.A1D();
                } else {
                    1XW.A00(r3, r2, A17);
                }
                r3.A0z();
            }
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
