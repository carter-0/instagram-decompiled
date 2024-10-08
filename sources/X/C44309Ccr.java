package X;

import java.io.IOException;

/* renamed from: X.Ccr  reason: case insensitive filesystem */
public abstract class C44309Ccr {
    public static BGB parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            BFZ bfz = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C53452Gok gok = null;
            C42100BHd bHd = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("midcard".equals(A17)) {
                    bfz = C44213Caa.parseFromJson(r5);
                } else if ("midcard_v2".equals(A17)) {
                    gok = C54808HTp.parseFromJson(r5);
                } else if ("su".equals(A17)) {
                    bHd = C44482Cfe.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new BGB(bfz, gok, bHd);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
