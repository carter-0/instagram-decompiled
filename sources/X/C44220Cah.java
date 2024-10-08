package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cah  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44220Cah {
    public static Map A00(C46253DSi dSi) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dSi.BE9() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, dSi.BE9());
        }
        if (dSi.BEQ() != null) {
            A1H.put(AnonymousClass000.A00(1427), dSi.BEQ());
        }
        return 0Yt.A0B(A1H);
    }
}
