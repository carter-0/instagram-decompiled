package X;

import java.io.IOException;

/* renamed from: X.CkZ  reason: case insensitive filesystem */
public abstract class C44762CkZ {
    public static C45218CsZ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45218CsZ csZ = new C45218CsZ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("image".equals(AnonymousClass7TE.A17(r3))) {
                    csZ.A00 = C44761CkY.parseFromJson(r3);
                }
                r3.A0z();
            }
            return csZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
