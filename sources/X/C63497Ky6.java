package X;

import java.io.IOException;

/* renamed from: X.Ky6  reason: case insensitive filesystem */
public abstract class C63497Ky6 {
    public static 1vN parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1vN r0 = new 1vN();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("sub_share_id".equals(A17)) {
                    r0.A00 = r3.A1D();
                } else if ("is_configured_in_server".equals(A17)) {
                    r0.A01 = r3.A0d();
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
