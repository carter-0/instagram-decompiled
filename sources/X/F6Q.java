package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

public final class F6Q {
    public static C47346Dvg parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C47346Dvg dvg = new C47346Dvg();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (RealtimeConstants.SEND_SUCCESS.equals(A17)) {
                    dvg.A01 = r4.A0d();
                } else if ("error_message".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    dvg.A00 = str;
                } else {
                    1XY.A01(r4, dvg, A17);
                }
                r4.A0z();
            }
            return dvg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
