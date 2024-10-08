package X;

import java.io.IOException;

public abstract class RVI {
    public static C10394RrV parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C10394RrV rrV = new C10394RrV();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("offset".equals(A17)) {
                    rrV.A00 = r3.A0y();
                } else if ("duplicate".equals(A17)) {
                    rrV.A01 = r3.A0d();
                }
                r3.A0z();
            }
            return rrV;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
