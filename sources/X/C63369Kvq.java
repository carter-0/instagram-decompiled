package X;

import java.io.IOException;

/* renamed from: X.Kvq  reason: case insensitive filesystem */
public abstract class C63369Kvq {
    public static C63738L4w parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C63738L4w l4w = new C63738L4w();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("lat".equals(A17)) {
                    l4w.A00 = r3.A0U();
                } else if ("lng".equals(A17)) {
                    l4w.A01 = r3.A0U();
                }
                r3.A0z();
            }
            return l4w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
