package X;

import com.instagram.camera.effect.models.ThumbnailImage;
import java.io.IOException;

/* renamed from: X.Chi  reason: case insensitive filesystem */
public abstract class C44610Chi {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.camera.effect.models.ThumbnailImage, java.lang.Object] */
    public static ThumbnailImage parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("uri".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = 16h.A00(r3);
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
