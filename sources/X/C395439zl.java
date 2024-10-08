package X;

import java.io.IOException;

/* renamed from: X.9zl  reason: invalid class name and case insensitive filesystem */
public abstract class C395439zl {
    public static C66251lD parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C66251lD r0 = new C66251lD();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("boost_access_token_id".equals(A17)) {
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
