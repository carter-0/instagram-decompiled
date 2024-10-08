package X;

import java.io.IOException;

/* renamed from: X.Kud  reason: case insensitive filesystem */
public abstract class C63294Kud {
    public static C61288K0z parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("viewer_vertical_swipe".equals(A17) || "profile_live_ring_enabled".equals(A17) || "home_adaptive_feed_enabled".equals(A17) || "filter_and_sort_enabled".equals(A17)) {
                    r3.A0d();
                } else if ("home_adaptive_feed_threshold".equals(A17)) {
                    r3.A1D();
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
