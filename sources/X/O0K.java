package X;

import java.io.IOException;

public abstract class O0K {
    public static C70825OMx parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C70825OMx oMx = new C70825OMx();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("item_id".equals(A17)) {
                    oMx.A08 = AnonymousClass7TG.A0l(r5);
                } else if ("client_context".equals(A17)) {
                    oMx.A07 = AnonymousClass7TG.A0l(r5);
                } else if ("sender_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    oMx.A09 = A0l;
                } else if ("timestamp".equals(A17)) {
                    oMx.A00 = r5.A0y();
                } else if ("media".equals(A17)) {
                    oMx.A02 = 1Xj.A00(r5);
                } else if ("target_url".equals(A17)) {
                    oMx.A0A = AnonymousClass7TG.A0l(r5);
                } else if (AnonymousClass000.A00(88).equals(A17)) {
                    oMx.A01 = 16h.A00(r5);
                } else if ("is_collection_item".equals(A17)) {
                    oMx.A0B = r5.A0d();
                } else if (AnonymousClass000.A00(3057).equals(A17)) {
                    oMx.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("ephemeral_lifetime_ms".equals(A17)) {
                    oMx.A05 = AnonymousClass7TF.A0Z(r5);
                } else if ("is_instamadillo".equals(A17)) {
                    oMx.A03 = AnonymousClass7TF.A0S(r5);
                } else if ("is_taken_down".equals(A17)) {
                    oMx.A04 = AnonymousClass7TF.A0S(r5);
                }
                r5.A0z();
            }
            return oMx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
