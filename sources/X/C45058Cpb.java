package X;

import java.io.IOException;

/* renamed from: X.Cpb  reason: case insensitive filesystem */
public abstract class C45058Cpb {
    public static C61069Jw7 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45063Cpg cpg = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C45066Cpj cpj = null;
            C61079JwH jwH = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("link_out".equals(A17)) {
                    cpg = C45064Cph.parseFromJson(r5);
                } else if ("shopping_cart".equals(A17)) {
                    cpj = C45067Cpk.parseFromJson(r5);
                } else if ("view_in_cart".equals(A17)) {
                    jwH = C45060Cpd.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new C61069Jw7(7, jwH, cpg, cpj);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
