package X;

import java.io.IOException;

/* renamed from: X.Cl7  reason: case insensitive filesystem */
public abstract class C44796Cl7 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cl6, java.lang.Object] */
    public static C44795Cl6 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("has_shared_info".equals(A17)) {
                    r3.A0d();
                } else if (C41845B3m.A17(A17)) {
                    C41846B3n.A1A(r3);
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
