package X;

import java.io.IOException;

/* renamed from: X.Cju  reason: case insensitive filesystem */
public abstract class C44726Cju {
    public static C45216CsU parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C45216CsU csU = new C45216CsU();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                } else if ("keyword".equals(A0q)) {
                    csU.A00 = C44727Cjv.parseFromJson(r4);
                }
                r4.A0z();
            }
            return csU;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
