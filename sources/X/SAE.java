package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

public final class SAE {
    public static C8771R8w parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (RealtimeConstants.SEND_SUCCESS.equals(A17)) {
                    r0.A02 = r4.A0d();
                } else if ("file_handle1".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A00 = A0l;
                } else if ("file_handle2".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r4);
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
