package X;

import java.io.IOException;

/* renamed from: X.V9z  reason: case insensitive filesystem */
public abstract class C16896V9z {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.V37] */
    public static V37 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            V35 v35 = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("ig.data.InAppUrlConfig".equals(AnonymousClass7TE.A17(r3))) {
                    v35 = C16894V9x.parseFromJson(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            obj.A00 = v35;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
