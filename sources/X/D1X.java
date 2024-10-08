package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.stickerstore.TypedImageUrl;
import java.io.IOException;

public abstract class D1X {
    public static TypedImageUrl parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            SimpleImageUrl simpleImageUrl = null;
            String str = null;
            Boolean bool = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("image_url".equals(A17)) {
                    simpleImageUrl = 16h.A00(r10);
                } else if (!"mime_type".equals(A17)) {
                    bool = C41847B3o.A0z(r10, bool, A17, "is_animated");
                } else if (r10.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r10.A1P();
                }
                r10.A0z();
            }
            if (simpleImageUrl == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_url", r10, "TypedImageUrl");
            } else if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("mime_type", r10, "TypedImageUrl");
            } else if (bool != null || !(r10 instanceof 0c9)) {
                return new TypedImageUrl(simpleImageUrl, str, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_animated", r10, "TypedImageUrl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, TypedImageUrl typedImageUrl) {
        r2.A0c();
        ImageUrl imageUrl = typedImageUrl.A00;
        if (imageUrl != null) {
            r2.A0q("image_url");
            16h.A01(r2, imageUrl);
        }
        String str = typedImageUrl.A01;
        if (str != null) {
            r2.A0R("mime_type", str);
        }
        r2.A0S("is_animated", typedImageUrl.A02);
        r2.A0Z();
    }
}
