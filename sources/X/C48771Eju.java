package X;

import java.io.IOException;

/* renamed from: X.Eju  reason: case insensitive filesystem */
public abstract class C48771Eju {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Ejt, java.lang.Object] */
    public static C48770Ejt parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("follower".equals(A17) || "following".equals(A17) || "following_and_follower".equals(A17) || "reciprocal_follower".equals(A17)) {
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
