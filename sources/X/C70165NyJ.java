package X;

import java.io.IOException;

/* renamed from: X.NyJ  reason: case insensitive filesystem */
public abstract class C70165NyJ {
    public static OC5 parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            OC5 oc5 = new OC5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("message_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    oc5.A01 = str;
                } else if ("metadata".equals(A17)) {
                    oc5.A00 = C70087Nx3.parseFromJson(r4);
                }
                r4.A0z();
            }
            return oc5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
