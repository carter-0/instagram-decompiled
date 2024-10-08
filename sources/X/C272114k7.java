package X;

import java.io.IOException;

/* renamed from: X.4k7  reason: invalid class name and case insensitive filesystem */
public final class C272114k7 {
    public static C272104k6 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("pending_requests_total".equals(A0q)) {
                    r0.A00 = r3.A1D();
                } else if ("unread_pending_requests".equals(A0q)) {
                    r0.A01 = r3.A1D();
                } else if ("notes".equals(A0q)) {
                    r0.A02 = C272154kD.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r0, A0q);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
