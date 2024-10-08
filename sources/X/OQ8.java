package X;

import java.io.IOException;

public final class OQ8 {
    public static NH5 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(1838).equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("restoration_cdn_url".equals(A17)) {
                    r1.A00 = AnonymousClass7TG.A0l(r3);
                } else {
                    1XY.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
