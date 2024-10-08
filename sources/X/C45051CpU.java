package X;

import java.io.IOException;

/* renamed from: X.CpU  reason: case insensitive filesystem */
public abstract class C45051CpU {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.CtC, java.lang.Object] */
    public static C45249CtC parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if (C41845B3m.A1L(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("ar_effect_metadata".equals(A17)) {
                    obj.A00 = C44911Cn1.parseFromJson(r3);
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
