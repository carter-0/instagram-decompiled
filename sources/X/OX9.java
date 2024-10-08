package X;

import java.io.IOException;

public final class OX9 {
    public static C67533MpS parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C67533MpS mpS = new C67533MpS();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A00(r3, mpS, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return mpS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(16F r2, C67533MpS mpS, String str) {
        String A1P;
        if ("modification_token".equals(str)) {
            if (r2.A11() == 16L.A0G) {
                A1P = null;
            } else {
                A1P = r2.A1P();
            }
            mpS.A00 = A1P;
            return;
        }
        1XY.A01(r2, mpS, str);
    }
}
