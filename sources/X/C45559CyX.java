package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

/* renamed from: X.CyX  reason: case insensitive filesystem */
public final class C45559CyX {
    public static C43797CDp parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("attribution_preview_url".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    r3.A02 = str;
                } else if (RealtimeConstants.SEND_SUCCESS.equals(A17)) {
                    r3.A01 = AnonymousClass7TF.A0S(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            r3.A00 = new C42024BAz(r3.A02, C41845B3m.A14(r3.A01));
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
