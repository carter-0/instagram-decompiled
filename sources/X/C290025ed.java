package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.5ed  reason: invalid class name and case insensitive filesystem */
public abstract class C290025ed {
    public static C376649Iu parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("image".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r5);
                }
                r5.A0z();
            }
            return new C376649Iu((ImageUrl) simpleImageUrl, str, 9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
