package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;

/* renamed from: X.5xV  reason: invalid class name and case insensitive filesystem */
public abstract class C300615xV {
    public static C376649Iu parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            ExtendedImageUrl extendedImageUrl = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("preview_icon_type".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("url_info".equals(A0q)) {
                    extendedImageUrl = 16W.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new C376649Iu(str, (Object) extendedImageUrl, 8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
