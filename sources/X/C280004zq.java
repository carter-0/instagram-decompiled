package X;

import java.io.IOException;

/* renamed from: X.4zq  reason: invalid class name and case insensitive filesystem */
public abstract class C280004zq {
    public static C280014zr parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C280014zr r0 = new C280014zr();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("ad_id".equals(A0q)) {
                    r0.A00 = r3.A0y();
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
