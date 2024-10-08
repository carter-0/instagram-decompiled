package X;

import java.io.IOException;

/* renamed from: X.CkV  reason: case insensitive filesystem */
public abstract class C44759CkV {
    public static CsX parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            CsX csX = new CsX();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("preview_payload".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("image".equals(A0q)) {
                    csX.A00 = C44758CkU.parseFromJson(r3);
                }
                r3.A0z();
            }
            return csX;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
