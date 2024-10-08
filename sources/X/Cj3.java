package X;

import java.io.IOException;

public abstract class Cj3 {
    public static C61072JwA parseFromJson(16F r6) {
        String A00;
        0qQ.A0B(r6, 0);
        try {
            Integer num = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            N49 n49 = null;
            while (true) {
                16L A1J = r6.A1J();
                16L r1 = 16L.A09;
                A00 = C273654mx.A00(1429);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                if (A00.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("context".equals(A17)) {
                    n49 = C44683Cj2.parseFromJson(r6);
                }
                r6.A0z();
            }
            if (num != null || !(r6 instanceof 0c9)) {
                return new C61072JwA(num.intValue(), 16, (Object) n49);
            }
            AnonymousClass7TF.A1L(A00, r6, "InstamadilloActionLog");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
