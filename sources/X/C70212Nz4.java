package X;

import java.io.IOException;

/* renamed from: X.Nz4  reason: case insensitive filesystem */
public abstract class C70212Nz4 {
    public static C65831h5 parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C65831h5 r0 = new C65831h5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C66581MXm.A1X(r4, A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A00 = str;
                } else if ("to_mute".equals(A0q)) {
                    r0.A01 = r4.A0d();
                } else {
                    C66670Mad.A01(r4, r0, A0q);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
