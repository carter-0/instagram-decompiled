package X;

import java.io.IOException;

/* renamed from: X.CgZ  reason: case insensitive filesystem */
public abstract class C44539CgZ {
    public static BI2 parseFromJson(16F r5) {
        String A00;
        0qQ.A0B(r5, 0);
        try {
            1Xj r2 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (true) {
                16L A1J = r5.A1J();
                16L r1 = 16L.A09;
                A00 = C273654mx.A00(939);
                if (A1J == r1) {
                    break;
                }
                if (C41846B3n.A1b(r5, A00)) {
                    r2 = 1Xj.A00(r5);
                }
                r5.A0z();
            }
            if (r2 != null || !(r5 instanceof 0c9)) {
                return new BI2(r2);
            }
            AnonymousClass7TF.A1L(A00, r5, "ThreadHeaderContextRepostInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
