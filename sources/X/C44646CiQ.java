package X;

import java.io.IOException;

/* renamed from: X.CiQ  reason: case insensitive filesystem */
public abstract class C44646CiQ {
    public static C45409Cvp parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45409Cvp cvp = new C45409Cvp();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("item_count".equals(A17)) {
                    cvp.A00 = r4.A1D();
                } else if ("range_end_item_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    cvp.A02 = A0l;
                } else if ("range_end_otid".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    cvp.A03 = A0l2;
                } else if ("range_ephemeral_view_duration_sec".equals(A17)) {
                    cvp.A01 = r4.A1D();
                } else if ("range_start_item_id".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    cvp.A04 = A0l3;
                } else if ("range_start_otid".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    cvp.A05 = A0l4;
                }
                r4.A0z();
            }
            return cvp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
