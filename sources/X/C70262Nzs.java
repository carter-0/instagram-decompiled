package X;

import java.io.IOException;

/* renamed from: X.Nzs  reason: case insensitive filesystem */
public abstract class C70262Nzs {
    public static AnonymousClass1hH parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1hH r0 = new AnonymousClass1hH();
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
                } else if ("translation_enabled".equals(A0q)) {
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
