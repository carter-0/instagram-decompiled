package X;

import java.io.IOException;

public abstract class VBh {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.VS6] */
    public static VS6 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("conditions".equals(A17)) {
                    C16596Uxq uxq = (C16596Uxq) C16596Uxq.A01.get(r3.A1Q());
                    if (uxq == null) {
                        uxq = C16596Uxq.UNKNOWN;
                    }
                    obj.A00 = uxq;
                } else if ("temp_celsius".equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0U(r3);
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
