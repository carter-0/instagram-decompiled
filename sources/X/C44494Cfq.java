package X;

import java.io.IOException;

/* renamed from: X.Cfq  reason: case insensitive filesystem */
public abstract class C44494Cfq {
    public static C42104BHh parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C42106BHj bHj = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("data".equals(A17)) {
                    bHj = C44497Cft.parseFromJson(r5);
                } else if (C41845B3m.A1C(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new C42104BHh(bHj, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
