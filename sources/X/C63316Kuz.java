package X;

import java.io.IOException;

/* renamed from: X.Kuz  reason: case insensitive filesystem */
public abstract class C63316Kuz {
    public static C61218JzB parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1Xj r1 = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("likes".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("metadata".equals(A17)) {
                    r1 = 1Xj.A00(r6);
                }
                r6.A0z();
            }
            if (r1 != null || !(r6 instanceof 0c9)) {
                return new C61218JzB(r1, num);
            }
            AnonymousClass7TF.A1L("metadata", r6, "MediaKitMedia");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
