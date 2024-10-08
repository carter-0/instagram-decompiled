package X;

import java.io.IOException;

public final class F7T {
    public static DvI parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            DvI dvI = new DvI();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("location_page_to_share_url".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    dvI.A00 = str;
                } else {
                    1XY.A01(r4, dvI, A17);
                }
                r4.A0z();
            }
            return dvI;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
