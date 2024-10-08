package X;

import java.io.IOException;

/* renamed from: X.Kvg  reason: case insensitive filesystem */
public abstract class C63359Kvg {
    public static 1vI parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1vI r1 = new 1vI();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("sub_share_id".equals(A17)) {
                    r1.A00 = r3.A1D();
                } else if ("is_configured_in_server".equals(A17)) {
                    r1.A02 = r3.A0d();
                } else if (AnonymousClass000.A00(621).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r1.A01 = str;
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
