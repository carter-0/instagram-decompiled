package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;

/* renamed from: X.4jG  reason: invalid class name and case insensitive filesystem */
public abstract class C271594jG {
    public static AnonymousClass4jH parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ImageInfoImpl imageInfoImpl = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("image_versions2".equals(A0q)) {
                    imageInfoImpl = 1dH.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (imageInfoImpl != null || !(r5 instanceof 0c9)) {
                return new AnonymousClass4jH(imageInfoImpl);
            }
            ((0c9) r5).A03.A00("image_versions2", "ThreadImage");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
