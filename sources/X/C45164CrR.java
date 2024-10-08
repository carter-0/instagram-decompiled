package X;

import java.io.IOException;

/* renamed from: X.CrR  reason: case insensitive filesystem */
public abstract class C45164CrR {
    public static C43845CFl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C43845CFl cFl = new C43845CFl();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("item".equals(A17)) {
                    cFl.A00 = C275974sH.parseFromJson(r3);
                } else {
                    1XY.A01(r3, cFl, A17);
                }
                r3.A0z();
            }
            return cFl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
