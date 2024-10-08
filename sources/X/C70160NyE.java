package X;

import java.io.IOException;

/* renamed from: X.NyE  reason: case insensitive filesystem */
public abstract class C70160NyE {
    public static OC3 parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            OC3 oc3 = new OC3();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(4654).equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    oc3.A01 = str;
                } else if ("item_info".equals(A17)) {
                    oc3.A00 = C70164NyI.parseFromJson(r4);
                }
                r4.A0z();
            }
            return oc3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
