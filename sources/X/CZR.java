package X;

import java.io.IOException;

public abstract class CZR {
    public static BFD parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            BF9 bf9 = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C2808354j r3 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("profile_card_info".equals(A17)) {
                    bf9 = CZB.parseFromJson(r4);
                } else if ("question_card_info".equals(A17)) {
                    r3 = C2808254i.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new BFD(r3, bf9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
