package X;

import java.io.IOException;

public final class F7S {
    public static DvH parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            DvH dvH = new DvH();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("live_to_share_url".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    dvH.A00 = str;
                } else {
                    1XY.A01(r4, dvH, A17);
                }
                r4.A0z();
            }
            return dvH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
