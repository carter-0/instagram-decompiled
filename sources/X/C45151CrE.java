package X;

import java.io.IOException;

/* renamed from: X.CrE  reason: case insensitive filesystem */
public abstract class C45151CrE {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.L7F] */
    public static L7F parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("formatted_amount_raised".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("num_supporters".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("num_badges".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("formatted_incentive_match".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("maxed_out_match_limit".equals(A17)) {
                    r3.A0d();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
