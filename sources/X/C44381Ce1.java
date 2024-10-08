package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Ce1  reason: case insensitive filesystem */
public abstract class C44381Ce1 {
    public static C42075BGd parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            SimpleImageUrl simpleImageUrl = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (AnonymousClass000.A00(513).equals(A17)) {
                    simpleImageUrl = 16h.A00(r10);
                } else if ("attribution_label".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("bloks_app_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("bloks_attribution_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("attribution_label", r10, "StoryBloksAttributionDictImpl");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new C42075BGd(simpleImageUrl, str, str3, str2);
            } else {
                AnonymousClass7TF.A1L("bloks_attribution_type", r10, "StoryBloksAttributionDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
