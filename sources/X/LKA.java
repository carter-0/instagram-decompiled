package X;

import java.io.IOException;

public final class LKA {
    public static C63673L2j parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C63673L2j l2j = new C63673L2j();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("live_comment_like_subscribe".equals(AnonymousClass7TE.A17(r4))) {
                    L8W parseFromJson = C63481Kxk.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    l2j.A00 = parseFromJson;
                }
                r4.A0z();
            }
            return l2j;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
