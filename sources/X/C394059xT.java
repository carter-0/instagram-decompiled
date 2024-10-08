package X;

import com.instagram.common.gallery.Medium;
import java.io.IOException;

/* renamed from: X.9xT  reason: invalid class name and case insensitive filesystem */
public abstract class C394059xT {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.9m7, X.6MU, java.lang.Object] */
    public static C387379m7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("medium".equals(A17)) {
                    Medium parseFromJson = C353258Gx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A02 = parseFromJson;
                } else if ("max_width".equals(A17)) {
                    obj.A01 = r4.A1D();
                } else if ("max_height".equals(A17)) {
                    obj.A00 = r4.A1D();
                } else {
                    AAV.A01(r4, obj, A17);
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
