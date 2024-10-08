package X;

import java.io.IOException;

public final class F7W {
    public static DvK parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            DvK dvK = new DvK();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("profile_to_share_url".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    dvK.A00 = str;
                } else {
                    1XY.A01(r4, dvK, A17);
                }
                r4.A0z();
            }
            return dvK;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
