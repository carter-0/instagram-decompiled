package X;

import com.instagram.ui.text.TextShadow;
import java.io.IOException;

public abstract class A1W {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.ui.text.TextShadow, java.lang.Object] */
    public static TextShadow parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("color".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("distance_resource_id".equals(A17)) {
                    obj.A01 = r3.A1D();
                } else if ("radius_resource_id".equals(A17)) {
                    obj.A02 = r3.A1D();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
