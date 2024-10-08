package X;

import java.io.IOException;

/* renamed from: X.3l3  reason: invalid class name and case insensitive filesystem */
public abstract class C250193l3 {
    public static C250203l4 parseFromJson(16F r3) {
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
                if ("isLeadGenAd".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                }
                r3.A0z();
            }
            return new C250203l4(bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
