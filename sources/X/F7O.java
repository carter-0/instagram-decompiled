package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

public final class F7O {
    public static C47353Dvn parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (Dd6.A00().equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A01 = str;
                } else if ("profile_pic_url".equals(A17)) {
                    SimpleImageUrl A00 = 16h.A00(r4);
                    0qQ.A0B(A00, 0);
                    r0.A00 = A00;
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
