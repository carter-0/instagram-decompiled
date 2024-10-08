package X;

import java.io.IOException;

/* renamed from: X.Ciu  reason: case insensitive filesystem */
public abstract class C44676Ciu {
    public static C61081JwJ parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C61081JwJ jwJ = new C61081JwJ(43);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    jwJ.A01 = str;
                } else if ("school_data".equals(A0q)) {
                    jwJ.A00 = C44675Cit.parseFromJson(r3);
                }
                r3.A0z();
            }
            return jwJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
