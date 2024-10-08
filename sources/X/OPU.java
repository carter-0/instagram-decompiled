package X;

import java.io.IOException;

public final class OPU {
    public static NHL parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("address".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r5);
                } else if (C66643MaC.A01(0, 12, 55).equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("email".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r5);
                } else if (AnonymousClass000.A00(241).equals(A17)) {
                    r1.A00 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, r1, A17);
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
