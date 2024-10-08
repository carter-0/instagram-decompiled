package X;

import java.io.IOException;

/* renamed from: X.En3  reason: case insensitive filesystem */
public abstract class C48965En3 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.EwN, java.lang.Object] */
    public static C49482EwN parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1B(A17)) {
                    obj.A00 = C49001End.parseFromJson(r3);
                } else if ("login_nonce".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A01 = str;
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
