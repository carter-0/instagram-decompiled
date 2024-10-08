package X;

import java.io.IOException;

public final class FCC {
    public static DwW parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A00(r3, r0, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(16F r1, DwW dwW, String str) {
        if ("errors".equals(str)) {
            dwW.A01 = C48318Ecb.A00(r1);
        } else if ("phone_number_valid".equals(str)) {
            dwW.A02 = r1.A0d();
        } else if ("phone_verification_settings".equals(str)) {
            dwW.A00 = C48968En6.parseFromJson(r1);
        } else {
            1XY.A01(r1, dwW, str);
        }
    }
}
