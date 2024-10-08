package X;

import java.io.IOException;

/* renamed from: X.4cA  reason: invalid class name and case insensitive filesystem */
public abstract class C267764cA {
    public static C267774cB parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Float f = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Float f2 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("x".equals(A0q)) {
                    f = new Float(r4.A0U());
                } else if ("y".equals(A0q)) {
                    f2 = new Float(r4.A0U());
                }
                r4.A0z();
            }
            return new C267774cB(f, f2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
