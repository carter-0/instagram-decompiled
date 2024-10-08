package X;

import java.io.IOException;

/* renamed from: X.Nzp  reason: case insensitive filesystem */
public abstract class C70259Nzp {
    public static AnonymousClass1n7 parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1n7 r0 = new AnonymousClass1n7();
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
                    r0.A01 = str;
                } else if ("notification_preview_controls".equals(A0q)) {
                    r0.A00 = r4.A1D();
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
