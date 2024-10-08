package X;

import java.io.IOException;

public abstract class O1Z {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.OCZ] */
    public static OCZ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("android_notif_count".equals(A17) || "notif_count".equals(A17)) {
                    obj.A01 = r3.A1D();
                } else if ("android_last_seen_timestamp".equals(A17) || "last_seen_timestamp".equals(A17)) {
                    obj.A00 = r3.A1D();
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
