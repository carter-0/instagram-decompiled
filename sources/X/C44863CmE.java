package X;

import java.io.IOException;

/* renamed from: X.CmE  reason: case insensitive filesystem */
public abstract class C44863CmE {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.CmD] */
    public static C44862CmD parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("category".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if (C41845B3m.A1Q(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if (C41845B3m.A17(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("support_cta_bloks_url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
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
