package X;

import java.io.IOException;

/* renamed from: X.ClY  reason: case insensitive filesystem */
public abstract class C44822ClY {
    public static C61076JwE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (!"semanitcs".equals(A17)) {
                    l = C41847B3o.A14(r5, l, A17, "ssrcs");
                } else if (r5.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r5.A1P();
                }
                r5.A0z();
            }
            return new C61076JwE(str, (Object) l, 3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
