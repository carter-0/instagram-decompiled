package X;

import java.io.IOException;

/* renamed from: X.Cm5  reason: case insensitive filesystem */
public abstract class C44854Cm5 {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Cm4] */
    public static C44853Cm4 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("item_id".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("replay_expiring_at_us".equals(A17)) {
                    r3.A0y();
                } else if ("expiring_media_seen_count".equals(A17)) {
                    r3.A1D();
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
