package X;

import java.io.IOException;

/* renamed from: X.3Tf  reason: invalid class name and case insensitive filesystem */
public abstract class C242253Tf {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.3Tg] */
    public static C242263Tg parseFromJson(16F r3) {
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
                if ("capabilities_0".equals(A0q)) {
                    obj.A00 = r3.A0y();
                } else if ("capabilities_1".equals(A0q)) {
                    obj.A01 = r3.A0y();
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
