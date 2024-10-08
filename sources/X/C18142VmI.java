package X;

import java.io.IOException;

/* renamed from: X.VmI  reason: case insensitive filesystem */
public final class C18142VmI {
    public static UXR parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("can_run_ig_backed_ads".equals(A17)) {
                    r0.A00 = r3.A0d();
                } else if ("can_use_promote_hard_link".equals(A17)) {
                    r0.A01 = r3.A0d();
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
