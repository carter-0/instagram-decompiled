package X;

import java.io.IOException;

/* renamed from: X.D0b  reason: case insensitive filesystem */
public final class C45651D0b {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.5u5, X.CGq] */
    public static C43876CGq parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? r2 = new C298815u5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("blend".equals(A17)) {
                    r2.A00 = C44078CUv.parseFromJson(r3);
                } else {
                    AnonymousClass93W.A00(r3, r2, A17);
                }
                r3.A0z();
            }
            r2.A01();
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
