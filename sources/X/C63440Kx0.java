package X;

import java.io.IOException;

/* renamed from: X.Kx0  reason: case insensitive filesystem */
public abstract class C63440Kx0 {
    public static C61291K1c parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61291K1c k1c = new C61291K1c();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("destination_row_section".equals(A17)) {
                    k1c.A00 = C63438Kwy.parseFromJson(r3);
                } else {
                    1XY.A01(r3, k1c, A17);
                }
                r3.A0z();
            }
            return k1c;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
