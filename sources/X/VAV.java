package X;

import com.instagram.business.promote.model.RejectionReasonRanges;
import java.io.IOException;

public abstract class VAV {
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.business.promote.model.RejectionReasonRanges, java.lang.Object] */
    public static RejectionReasonRanges parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("offset".equals(A17)) {
                    obj.A01 = r4.A1D();
                } else if ("length".equals(A17)) {
                    obj.A00 = r4.A1D();
                } else if ("entity_url".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    obj.A02 = str;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
