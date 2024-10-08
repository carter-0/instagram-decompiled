package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.NrY  reason: case insensitive filesystem */
public abstract class C69749NrY {
    public static C68144N2k parseFromJson(16F r18) {
        16F r2 = r18;
        0qQ.A0B(r2, 0);
        try {
            Integer num = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            User user = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("number_media_to_fetch".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if ("posts_aspect_ratio".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r2);
                } else if ("reels_aspect_ratio".equals(A17)) {
                    f2 = AnonymousClass7TF.A0V(r2);
                } else if ("shimmer_aspect_ratio".equals(A17)) {
                    f3 = AnonymousClass7TF.A0V(r2);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r2, false);
                }
                r2.A0z();
            }
            if (num == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("number_media_to_fetch", r2, "AccountHCMMetadata");
            } else if (f == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("posts_aspect_ratio", r2, "AccountHCMMetadata");
            } else if (f2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("reels_aspect_ratio", r2, "AccountHCMMetadata");
            } else if (f3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("shimmer_aspect_ratio", r2, "AccountHCMMetadata");
            } else if (user != null || !(r2 instanceof 0c9)) {
                return new C68144N2k(user, f.floatValue(), f2.floatValue(), f3.floatValue(), num.intValue());
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r2, "AccountHCMMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
