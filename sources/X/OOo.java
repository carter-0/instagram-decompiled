package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

public final class OOo {
    public static NHT parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (RealtimeConstants.SEND_SUCCESS.equals(A17)) {
                    r0.A01 = AnonymousClass7TF.A0S(r3);
                } else if ("is_retryable".equals(A17)) {
                    r0.A00 = AnonymousClass7TF.A0S(r3);
                } else if ("is_prohibited".equals(A17)) {
                    r3.A0d();
                } else if ("error_message".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A02 = str;
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
