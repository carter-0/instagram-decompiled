package X;

import java.io.IOException;

public abstract class VB9 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.6MU, java.lang.Object, X.9ly] */
    public static C387289ly parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("timestamp_ms".equals(A17)) {
                    obj.A00 = r3.A0y();
                } else {
                    AAV.A01(r3, obj, A17);
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
