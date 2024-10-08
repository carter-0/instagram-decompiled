package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Ccq  reason: case insensitive filesystem */
public abstract class C44308Ccq {
    public static AnonymousClass3I9 parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("image_url".equals(A17)) {
                    simpleImageUrl = 16h.A00(r7);
                } else if ("text".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (str != null || !(r7 instanceof 0c9)) {
                return new AnonymousClass3I9(simpleImageUrl, str);
            }
            AnonymousClass7TF.A1L("text", r7, "ReelToastAPIImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
