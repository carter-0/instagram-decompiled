package X;

import java.io.IOException;

/* renamed from: X.3Sb  reason: invalid class name and case insensitive filesystem */
public abstract class C241963Sb {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.3Sc, java.lang.Object] */
    public static C241973Sc parseFromJson(16F r3) {
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
                if ("item_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A01 = str;
                } else if ("created_at".equals(A0q)) {
                    obj.A00 = r3.A0y();
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
