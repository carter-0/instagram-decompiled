package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.5ec  reason: invalid class name and case insensitive filesystem */
public abstract class C290015ec {
    public static C376649Iu parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("image".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r7);
                }
                r7.A0z();
            }
            if (str != null || !(r7 instanceof 0c9)) {
                return new C376649Iu((ImageUrl) simpleImageUrl, str, 10);
            }
            ((0c9) r7).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "NewsfeedStoryMedia");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
