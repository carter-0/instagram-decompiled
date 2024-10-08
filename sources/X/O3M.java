package X;

import java.io.IOException;

public abstract class O3M {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OEd, java.lang.Object] */
    public static C70632OEd parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("offset".equals(A17)) {
                    obj.A02 = AnonymousClass7TF.A0X(r3);
                } else if ("length".equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0X(r3);
                } else if ("token".equals(A17)) {
                    obj.A00 = O3L.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
