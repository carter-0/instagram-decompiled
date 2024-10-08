package X;

import java.io.IOException;

/* renamed from: X.Coe  reason: case insensitive filesystem */
public abstract class C45001Coe {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cv3, java.lang.Object] */
    public static C45361Cv3 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("background_url".equals(A17)) {
                    obj.A00 = 16h.A00(r3);
                } else if (C41845B3m.A1A(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1C(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
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
