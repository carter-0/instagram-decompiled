package X;

import java.io.IOException;

/* renamed from: X.5gG  reason: invalid class name and case insensitive filesystem */
public abstract class C290945gG {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5gH] */
    public static C290955gH parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("score".equals(A0q)) {
                    obj.A00 = r3.A0U();
                } else if ("entity_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A01 = str;
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
