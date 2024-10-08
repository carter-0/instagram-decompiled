package X;

import java.io.IOException;

/* renamed from: X.9yu  reason: invalid class name and case insensitive filesystem */
public abstract class C394919yu {
    public static C365058mS parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C365058mS r0 = new C365058mS();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("max_width_scale".equals(A17)) {
                    r0.A01 = (float) r4.A0U();
                } else if ("max_height_scale".equals(A17)) {
                    r0.A00 = (float) r4.A0U();
                } else if ("cap_width".equals(A17)) {
                    r0.A02 = r4.A0d();
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
