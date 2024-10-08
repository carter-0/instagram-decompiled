package X;

import java.io.IOException;

/* renamed from: X.9xV  reason: invalid class name and case insensitive filesystem */
public abstract class C394079xV {
    public static N4G parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            N4G n4g = new N4G();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(266).equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    n4g.A01 = str;
                } else if ("like_count".equals(A17)) {
                    n4g.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return n4g;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
