package X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.Nyt  reason: case insensitive filesystem */
public abstract class C70201Nyt {
    public static C66241l9 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66241l9 r0 = new C66241l9();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("direct_message".equals(A17)) {
                    C254703su A00 = C254703su.A00(r4, (DirectThreadKey) null, false);
                    0qQ.A0B(A00, 0);
                    r0.A01 = A00;
                } else if ("direct_forwarding_params".equals(A17)) {
                    DirectForwardingParams parseFromJson = C49753F5e.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else if (C66580MXl.A1Z(A17)) {
                    r0.A02 = C66580MXl.A0h(r4);
                } else {
                    C66893Meb.A01(r4, r0, A17);
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
