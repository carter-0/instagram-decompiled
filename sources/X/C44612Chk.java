package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Chk  reason: case insensitive filesystem */
public abstract class C44612Chk {
    public static JV7 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("collapsed_icon".equals(A17)) {
                    simpleImageUrl = 16h.A00(r9);
                } else if ("label".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("url".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("label", r9, "AttributionPivotPageResponse.AttributionPivotPageCTA");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new JV7((ImageUrl) simpleImageUrl, str, str2, 12);
            } else {
                AnonymousClass7TF.A1L("url", r9, "AttributionPivotPageResponse.AttributionPivotPageCTA");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
