package X;

import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import java.io.IOException;

/* renamed from: X.7P1  reason: invalid class name */
public abstract class AnonymousClass7P1 {
    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public static DirectShareTargetLoggingInfo parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Double d = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Boolean bool = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("final_score".equals(A0q)) {
                    d = Double.valueOf(r4.A0U());
                } else if ("is_from_server".equals(A0q)) {
                    bool = Boolean.valueOf(r4.A0d());
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (d != null) {
                obj.A01 = d;
            }
            if (bool == null) {
                return obj;
            }
            obj.A00 = bool;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
