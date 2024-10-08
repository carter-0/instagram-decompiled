package X;

import java.io.IOException;

/* renamed from: X.9wL  reason: invalid class name and case insensitive filesystem */
public abstract class C393379wL {
    public static C381449bm parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1ea r1 = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("bio_product".equals(AnonymousClass7TE.A17(r3))) {
                    r1 = C65591eY.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new C381449bm(r1);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
