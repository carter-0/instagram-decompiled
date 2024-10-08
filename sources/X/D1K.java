package X;

import java.io.IOException;

public final class D1K {
    public static CHF parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            CHF chf = new CHF();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("lead_gen_deep_link_user_info_create".equals(AnonymousClass7TE.A17(r3))) {
                    chf.A00 = Cl8.parseFromJson(r3);
                }
                r3.A0z();
            }
            return chf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
