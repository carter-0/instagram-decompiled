package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

public final class D2N {
    public static CHJ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (RealtimeConstants.SEND_SUCCESS.equals(AnonymousClass7TE.A17(r3))) {
                    r0.A00 = r3.A0d();
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
