package X;

import com.instagram.common.gallery.FaceCenter;
import java.io.IOException;

/* renamed from: X.9xF  reason: invalid class name and case insensitive filesystem */
public abstract class C393919xF {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.common.gallery.FaceCenter] */
    public static FaceCenter parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("x".equals(A17)) {
                    obj.A01 = (float) r4.A0U();
                } else if ("y".equals(A17)) {
                    obj.A02 = (float) r4.A0U();
                } else if ("confidence".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
