package X;

import java.io.IOException;

public final class D1Q {
    public static CE5 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("data".equals(A17)) {
                    r3.A01 = C44834Clk.parseFromJson(r4);
                } else if ("error".equals(A17)) {
                    r3.A02 = C44847Clx.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            r3.A00 = new C61213Jz6(r3.A01, r3.A02);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
