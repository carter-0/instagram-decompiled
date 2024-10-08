package X;

import java.io.IOException;

/* renamed from: X.Kty  reason: case insensitive filesystem */
public abstract class C63253Kty {
    public static C65321bo parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C65321bo r0 = new C65321bo();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("event_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A00 = str;
                } else {
                    C66893Meb.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
