package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;

/* renamed from: X.3tk  reason: invalid class name and case insensitive filesystem */
public abstract class C255203tk {
    public static C255243to parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            HashtagImpl hashtagImpl = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C255223tm r3 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("hashtag".equals(A0q)) {
                    hashtagImpl = C279594yt.parseFromJson(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    r3 = C255213tl.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C255243to(r3, hashtagImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
