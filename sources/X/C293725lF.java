package X;

import java.io.IOException;

/* renamed from: X.5lF  reason: invalid class name and case insensitive filesystem */
public abstract class C293725lF {
    public static C298685tr parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C298685tr r0 = new C298685tr();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("num_columns".equals(A0q) || "total_num_columns".equals(A0q)) {
                    r4.A1D();
                } else if ("aspect_ratio".equals(A0q)) {
                    r0.A00 = (float) r4.A0U();
                } else if ("autoplay".equals(A0q)) {
                    r0.A01 = r4.A0d();
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
