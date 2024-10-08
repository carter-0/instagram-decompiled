package X;

import java.io.IOException;

/* renamed from: X.Cq6  reason: case insensitive filesystem */
public abstract class C45088Cq6 {
    public static C61074JwC parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61074JwC jwC = new C61074JwC(20);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("route_behavior_meta".equals(A17)) {
                    jwC.A01 = C63443Kx8.parseFromJson(r3);
                } else if ("toast_behavior_meta".equals(A17)) {
                    jwC.A03 = C45093CqB.parseFromJson(r3);
                } else if ("select_behavior_meta".equals(A17)) {
                    jwC.A02 = C45092CqA.parseFromJson(r3);
                } else if ("multi_select_behavior_meta".equals(A17)) {
                    jwC.A00 = C45089Cq7.parseFromJson(r3);
                }
                r3.A0z();
            }
            return jwC;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
