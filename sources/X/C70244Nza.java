package X;

import java.io.IOException;

/* renamed from: X.Nza  reason: case insensitive filesystem */
public abstract class C70244Nza {
    public static C66061iy parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C66061iy r0 = new C66061iy();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C66581MXm.A1X(r3, A0q)) {
                    r0.A00 = C254733sx.parseFromJson(r3);
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
