package X;

import java.io.IOException;

/* renamed from: X.NyF  reason: case insensitive filesystem */
public abstract class C70161NyF {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OC4, java.lang.Object] */
    public static OC4 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("matched_message_info".equals(A17)) {
                    obj.A00 = C70160NyE.parseFromJson(r3);
                } else if ("thread".equals(A17)) {
                    obj.A01 = C370528wc.parseFromJson(r3);
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
