package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ecx  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48340Ecx {
    public static Map A00(AnonymousClass5Bm r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.getId());
        }
        if (r3.getName() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.getName());
        }
        return 0Yt.A0B(A1H);
    }
}
