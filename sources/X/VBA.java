package X;

import java.io.IOException;

public abstract class VBA {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.6MU, java.lang.Object, X.9m1] */
    public static C387319m1 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("max_width".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if (C273654mx.A00(317).equals(A17)) {
                    obj.A01 = r3.A0d();
                } else if (C273654mx.A00(321).equals(A17)) {
                    obj.A02 = r3.A0d();
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
