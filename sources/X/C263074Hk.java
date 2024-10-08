package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import java.io.IOException;

/* renamed from: X.4Hk  reason: invalid class name and case insensitive filesystem */
public abstract class C263074Hk {
    public static EffectThumbnailImageDict parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            SimpleImageUrl simpleImageUrl = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("uri".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r3);
                }
                r3.A0z();
            }
            return new EffectThumbnailImageDict(simpleImageUrl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
