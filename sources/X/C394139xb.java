package X;

import java.io.IOException;

/* renamed from: X.9xb  reason: invalid class name and case insensitive filesystem */
public abstract class C394139xb {
    public static C376429Hy parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C376429Hy r0 = new C376429Hy(1);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("top_left".equals(A17)) {
                    r0.A02 = (float) r4.A0U();
                } else if ("top_right".equals(A17)) {
                    r0.A03 = (float) r4.A0U();
                } else if ("bottom_right".equals(A17)) {
                    r0.A01 = (float) r4.A0U();
                } else if ("bottom_left".equals(A17)) {
                    r0.A00 = (float) r4.A0U();
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
