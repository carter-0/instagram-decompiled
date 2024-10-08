package X;

import java.io.IOException;

public abstract class VIU {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.VTy] */
    public static C17397VTy parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("point_x".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("point_y".equals(A17)) {
                    obj.A01 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
