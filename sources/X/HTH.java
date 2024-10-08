package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HTH {
    public static Map A00(JSM jsm) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (jsm.getDisplayName() != null) {
            A1H.put(AnonymousClass000.A00(47), jsm.getDisplayName());
        }
        if (jsm.getEmoji() != null) {
            A1H.put("emoji", jsm.getEmoji());
        }
        if (jsm.BEA() != null) {
            A1H.put(AnonymousClass000.A00(1425), jsm.BEA());
        }
        if (jsm.BEB() != null) {
            A1H.put(AnonymousClass000.A00(1426), jsm.BEB());
        }
        if (jsm.getName() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jsm.getName());
        }
        if (jsm.Bxi() != null) {
            A1H.put("source", jsm.Bxi());
        }
        if (jsm.CDk() != null) {
            A1H.put("version", jsm.CDk());
        }
        return 0Yt.A0B(A1H);
    }
}
