package X;

import java.io.IOException;

/* renamed from: X.8jp  reason: invalid class name and case insensitive filesystem */
public abstract class C363498jp {
    public static AnonymousClass805 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass805 r0 = new AnonymousClass805();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                String str = null;
                if ("surface".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A01 = str;
                } else if ("is_eligible".equals(A0q)) {
                    r0.A02 = r5.A0d();
                } else if ("ineligible_reason".equals(A0q)) {
                    if (r5.A11() != 16L.A0G) {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A00 = str;
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
