package X;

import java.io.IOException;

public final class ORP {
    public static NHQ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("is_enabled".equals(A17)) {
                    r0.A02 = AnonymousClass7TF.A0S(r3);
                } else if ("limited_categories".equals(A17)) {
                    r0.A00 = O3C.parseFromJson(r3);
                } else if ("limited_features".equals(A17)) {
                    r0.A01 = O3D.parseFromJson(r3);
                } else if ("reminder_date".equals(A17)) {
                    r0.A03 = AnonymousClass7TF.A0Z(r3);
                } else if ("start_date".equals(A17)) {
                    r0.A04 = AnonymousClass7TF.A0Z(r3);
                } else {
                    1XY.A01(r3, r0, A17);
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
