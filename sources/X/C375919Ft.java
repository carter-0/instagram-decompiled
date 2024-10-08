package X;

import java.io.IOException;

/* renamed from: X.9Ft  reason: invalid class name and case insensitive filesystem */
public final class C375919Ft {
    public static C375909Fs parseFromJson(16F r3) {
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
                if ("should_show_ad_responses_tab".equals(A0q)) {
                    r0.A00 = r3.A0d();
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
