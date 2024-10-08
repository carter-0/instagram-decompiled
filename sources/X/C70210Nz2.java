package X;

import java.io.IOException;

/* renamed from: X.Nz2  reason: case insensitive filesystem */
public abstract class C70210Nz2 {
    public static AnonymousClass1gz parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1gz r0 = new AnonymousClass1gz();
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
                    r0.A00 = str;
                } else if ("is_mentions_mute".equals(A0q)) {
                    r0.A01 = r3.A0d();
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
