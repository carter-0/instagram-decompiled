package X;

import java.io.IOException;

public abstract class CbV {
    public static C42060BFn parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            BE3 be3 = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C61111JxN jxN = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("category".equals(A17)) {
                    be3 = CVS.parseFromJson(r4);
                } else if ("playlist".equals(A17)) {
                    jxN = CbU.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C42060BFn(be3, jxN);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
