package X;

import java.io.IOException;

/* renamed from: X.NzZ  reason: case insensitive filesystem */
public abstract class C70243NzZ {
    public static AnonymousClass1j4 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1j4 r0 = new AnonymousClass1j4();
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
