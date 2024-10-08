package X;

import java.io.IOException;

public final class D31 {
    public static CGF parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            CGF cgf = new CGF();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("review_status".equals(A17)) {
                    cgf.A00 = r3.A1D();
                } else {
                    1XY.A01(r3, cgf, A17);
                }
                r3.A0z();
            }
            return cgf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
