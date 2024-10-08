package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.RgS  reason: case insensitive filesystem */
public abstract /* synthetic */ class C9770RgS {
    public static Map A00(C13898TjL tjL) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (tjL.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, tjL.getId());
        }
        if (tjL.getName() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, tjL.getName());
        }
        if (tjL.CDG() != null) {
            A1H.put("validOrigins", tjL.CDG());
        }
        return 0Yt.A0B(A1H);
    }
}
