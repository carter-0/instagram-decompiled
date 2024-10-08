package X;

import java.io.IOException;

/* renamed from: X.CmH  reason: case insensitive filesystem */
public abstract class C44866CmH {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.547] */
    public static AnonymousClass547 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1G(A17)) {
                    obj.A00 = r3.A1D();
                } else if (C41845B3m.A1F(A17)) {
                    obj.A01 = r3.A1D();
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
