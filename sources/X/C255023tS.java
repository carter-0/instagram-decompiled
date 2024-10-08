package X;

import java.io.IOException;

/* renamed from: X.3tS  reason: invalid class name and case insensitive filesystem */
public abstract class C255023tS {
    public static C255033tT parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Boolean bool = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("should_disable".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                }
                r3.A0z();
            }
            return new C255033tT(bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
