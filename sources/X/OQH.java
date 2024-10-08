package X;

import java.io.IOException;

public final class OQH {
    public static C68415NHa parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("message_search_results".equals(A17)) {
                    r0.A00 = C70162NyG.parseFromJson(r3);
                } else if ("reshared_content_results".equals(A17)) {
                    r0.A01 = C70163NyH.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
