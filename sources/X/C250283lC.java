package X;

import java.io.IOException;

/* renamed from: X.3lC  reason: invalid class name and case insensitive filesystem */
public abstract class C250283lC {
    public static C250323lG parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C250303lE r1 = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C255033tT r3 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("browser_peek".equals(A0q)) {
                    r1 = C250293lD.parseFromJson(r4);
                } else if ("persistent_iab".equals(A0q)) {
                    r3 = C255023tS.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C250323lG(r1, r3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
