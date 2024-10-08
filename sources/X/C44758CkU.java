package X;

import java.io.IOException;

/* renamed from: X.CkU  reason: case insensitive filesystem */
public abstract class C44758CkU {
    public static CsW parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            CsW csW = new CsW();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1G(A17) || C41845B3m.A1F(A17)) {
                    r3.A1D();
                } else if ("uri".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    csW.A00 = str;
                }
                r3.A0z();
            }
            return csW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
