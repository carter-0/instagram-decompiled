package X;

import java.io.IOException;

/* renamed from: X.Nxk  reason: case insensitive filesystem */
public abstract class C70130Nxk {
    public static N4O parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            N4O n4o = new N4O();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("expire_ms".equals(A17)) {
                    n4o.A01 = AnonymousClass7TF.A0Z(r3);
                } else if ("is_dm".equals(A17)) {
                    n4o.A00 = AnonymousClass7TF.A0S(r3);
                }
                r3.A0z();
            }
            return n4o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
