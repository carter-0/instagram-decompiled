package X;

import java.io.IOException;

public abstract class CXC {
    public static C42026BEb parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            BDy bDy = null;
            Long l = null;
            C42070BFy bFy = null;
            BGE bge = null;
            Long l2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("bounding_box".equals(A17)) {
                    bDy = CV4.parseFromJson(r9);
                } else if ("end_timestamp".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r9);
                } else if ("matched_products".equals(A17)) {
                    bFy = Cc2.parseFromJson(r9);
                } else if ("representative_points".equals(A17)) {
                    bge = C44315Ccx.parseFromJson(r9);
                } else {
                    l2 = C41847B3o.A14(r9, l2, A17, "start_timestamp");
                }
                r9.A0z();
            }
            return new C42026BEb(bDy, bFy, bge, l, l2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
