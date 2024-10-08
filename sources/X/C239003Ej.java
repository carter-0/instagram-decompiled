package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.3Ej  reason: invalid class name and case insensitive filesystem */
public abstract class C239003Ej {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.1Fn] */
    public static 1Fn parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A00 = str;
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    obj.A01 = str;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
