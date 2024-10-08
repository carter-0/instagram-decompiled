package X;

import java.io.IOException;

/* renamed from: X.Cgk  reason: case insensitive filesystem */
public abstract class C44550Cgk {
    public static C45267CtW parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            UKM ukm = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            BBN bbn = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("error".equals(A17)) {
                    ukm = C44284CcS.parseFromJson(r4);
                } else if ("payload".equals(A17)) {
                    bbn = C44549Cgj.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C45267CtW(ukm, bbn);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
