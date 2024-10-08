package X;

import java.io.IOException;

/* renamed from: X.VCe  reason: case insensitive filesystem */
public abstract class C16952VCe {
    public static VSF parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VSF vsf = new VSF();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C273654mx.A00(821).equals(A17)) {
                    vsf.A00 = r3.A1D();
                } else if (C273654mx.A00(2138).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vsf.A01 = str;
                }
                r3.A0z();
            }
            return vsf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
