package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.camera.effect.models.ThumbnailImage;
import java.io.IOException;

/* renamed from: X.Chg  reason: case insensitive filesystem */
public abstract class C44608Chg {
    public static L3R parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ThumbnailImage thumbnailImage = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("attribution_user_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("thumbnail_image".equals(A17)) {
                    thumbnailImage = C44610Chi.parseFromJson(r10);
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("attribution_user_id", r10, "AttributedEffect");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r10, "AttributedEffect");
            } else if (thumbnailImage != null || !(r10 instanceof 0c9)) {
                return new L3R(thumbnailImage, str, str2);
            } else {
                AnonymousClass7TF.A1L("thumbnail_image", r10, "AttributedEffect");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
