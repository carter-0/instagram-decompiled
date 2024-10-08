package X;

import java.io.IOException;

/* renamed from: X.8vw  reason: invalid class name and case insensitive filesystem */
public abstract class C370168vw {
    public static C370178vx parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C370178vx r0 = new C370178vx();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("transform_matrix_params".equals(A0q)) {
                    r0.A00 = C266634a4.A00(r3);
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
