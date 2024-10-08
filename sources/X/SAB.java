package X;

import java.io.IOException;

public final class SAB {
    public static C8742R7g parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("challenge_nonce".equals(A17)) {
                    r3.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("key_nonce".equals(A17)) {
                    r3.A02 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            String str = r3.A01;
            0qQ.A0A(str);
            r3.A00 = new QPc(str, r3.A02);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
