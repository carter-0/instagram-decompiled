package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.pendingmedia.model.SimpleUserStoryTarget;
import java.io.IOException;

/* renamed from: X.5IF  reason: invalid class name */
public abstract class AnonymousClass5IF {
    public static SimpleUserStoryTarget parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        String str = null;
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                }
                r3.A0z();
            }
            return C376399Hv.A01(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
