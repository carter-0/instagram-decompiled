package X;

import java.io.IOException;

/* renamed from: X.CgY  reason: case insensitive filesystem */
public abstract class C44538CgY {
    public static BI1 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            BI0 bi0 = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            BI2 bi2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("follow_info".equals(A17)) {
                    bi0 = C44536CgW.parseFromJson(r4);
                } else if ("repost_info".equals(A17)) {
                    bi2 = C44539CgZ.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new BI1(bi0, bi2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
