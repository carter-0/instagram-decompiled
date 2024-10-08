package X;

import java.io.IOException;

/* renamed from: X.V9x  reason: case insensitive filesystem */
public abstract class C16894V9x {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.V35] */
    public static V35 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            V36 v36 = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("navbar_config".equals(AnonymousClass7TE.A17(r3))) {
                    v36 = C16895V9y.parseFromJson(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            obj.A00 = v36;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
