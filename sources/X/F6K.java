package X;

import java.io.IOException;

public abstract class F6K {
    public static C47361Dvv parseFromJson(16F r3) {
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

    public static void A00(16F r1, C47361Dvv dvv, String str) {
        if ("two_factor_required".equals(str)) {
            dvv.A02 = r1.A0d();
        } else if ("two_factor_info".equals(str)) {
            dvv.A01 = C48970En8.parseFromJson(r1);
        } else if ("phone_verification_settings".equals(str)) {
            dvv.A00 = C48968En6.parseFromJson(r1);
        } else {
            1XY.A01(r1, dvv, str);
        }
    }
}
