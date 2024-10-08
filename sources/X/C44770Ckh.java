package X;

import java.io.IOException;

/* renamed from: X.Ckh  reason: case insensitive filesystem */
public abstract class C44770Ckh {
    public static C45221Csc parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45221Csc csc = new C45221Csc();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("image".equals(AnonymousClass7TE.A17(r3))) {
                    csc.A00 = C44769Ckg.parseFromJson(r3);
                }
                r3.A0z();
            }
            return csc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
