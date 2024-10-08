package X;

import java.io.IOException;

/* renamed from: X.Nz3  reason: case insensitive filesystem */
public abstract class C70211Nz3 {
    public static C65811gt parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C65811gt r0 = new C65811gt();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C66581MXm.A1X(r3, A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A01 = str;
                } else if ("is_mute".equals(A0q)) {
                    r0.A02 = r3.A0d();
                } else if ("mute_seconds".equals(A0q)) {
                    r0.A00 = AnonymousClass7TF.A0X(r3);
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
