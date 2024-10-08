package X;

import java.io.IOException;

public final class LK9 {
    public static K1H parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            K1H k1h = new K1H();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("badge_setting".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    k1h.A00 = C2816858z.A00(str);
                } else {
                    1XY.A01(r3, k1h, A17);
                }
                r3.A0z();
            }
            return k1h;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
