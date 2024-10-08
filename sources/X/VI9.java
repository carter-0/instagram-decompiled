package X;

import android.graphics.Path;
import java.io.IOException;

public abstract class VI9 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.6Mq, java.lang.Object] */
    public static C306566Mq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("rect_left".equals(A17)) {
                    obj.A03 = (float) r4.A0U();
                } else if ("rect_top".equals(A17)) {
                    obj.A05 = (float) r4.A0U();
                } else if ("rect_right".equals(A17)) {
                    obj.A04 = (float) r4.A0U();
                } else if ("rect_bottom".equals(A17)) {
                    obj.A02 = (float) r4.A0U();
                } else if ("radius_x".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("radius_y".equals(A17)) {
                    obj.A01 = (float) r4.A0U();
                } else if ("orientation".equals(A17)) {
                    obj.A06 = Path.Direction.valueOf(r4.A1Q());
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
