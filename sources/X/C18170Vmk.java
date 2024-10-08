package X;

import com.instagram.business.promote.model.PromoteCreateAudienceResponse;
import java.io.IOException;

/* renamed from: X.Vmk  reason: case insensitive filesystem */
public final class C18170Vmk {
    public static PromoteCreateAudienceResponse parseFromJson(16F r3) {
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
                if ("created_audience_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A01 = str;
                } else if ("audience_creation_success".equals(A17)) {
                    r0.A02 = r3.A0d();
                } else if ("error".equals(A17)) {
                    r0.A00 = C44284CcS.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
