package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Cbk  reason: case insensitive filesystem */
public abstract class C44249Cbk {
    public static C47212Dsz parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("media_fbid".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("media_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("thumbnail_url".equals(A17)) {
                    simpleImageUrl = 16h.A00(r10);
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_fbid", r10, "PreviewMedia");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r10, "PreviewMedia");
            } else if (simpleImageUrl != null || !(r10 instanceof 0c9)) {
                return new C47212Dsz(simpleImageUrl, str, str2);
            } else {
                AnonymousClass7TF.A1L("thumbnail_url", r10, "PreviewMedia");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
