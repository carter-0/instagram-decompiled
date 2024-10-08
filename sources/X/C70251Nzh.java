package X;

import java.io.IOException;

/* renamed from: X.Nzh  reason: case insensitive filesystem */
public abstract class C70251Nzh {
    public static C66021il parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C66021il r0 = new C66021il();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C66581MXm.A1X(r3, A0q)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("theme_id".equals(A0q)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("theme_info".equals(A0q)) {
                    r0.A00 = AnonymousClass3T6.A00(r3);
                } else {
                    C66670Mad.A01(r3, r0, A0q);
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
