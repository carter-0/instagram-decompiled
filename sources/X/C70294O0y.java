package X;

import java.io.IOException;

/* renamed from: X.O0y  reason: case insensitive filesystem */
public abstract class C70294O0y {
    public static OCS parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            OCS ocs = new OCS();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    ocs.A00 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A19(A0q)) {
                    ocs.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return ocs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
