package X;

import java.io.IOException;

/* renamed from: X.55n  reason: invalid class name and case insensitive filesystem */
public abstract class C2810255n {
    public static C2810355o parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("sync_all_launchers".equals(A0q)) {
                    r0.A01 = r3.A0d();
                } else if ("sync_all_qes".equals(A0q)) {
                    r3.A0d();
                } else if ("sync_ep_launchers".equals(A0q)) {
                    r0.A02 = r3.A0d();
                } else if ("cleanup_actions".equals(A0q)) {
                    r0.A00 = C44729Cjx.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r0, A0q);
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
