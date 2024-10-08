package X;

import java.io.IOException;

public final class D3A {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.5u5, X.CGs] */
    public static C43878CGs parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? r2 = new C298815u5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("metadata".equals(A17)) {
                    r2.A00 = C44509Cg5.parseFromJson(r3);
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
