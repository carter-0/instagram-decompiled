package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ed8  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48351Ed8 {
    public static Map A00(C51954G8x g8x) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (g8x.getEmoji() != null) {
            A1H.put("emoji", g8x.getEmoji());
        }
        if (g8x.B6N() != null) {
            A1H.put("fit_id", g8x.B6N());
        }
        if (g8x.BGL() != null) {
            A1H.put("image_url", g8x.BGL());
        }
        if (g8x.getName() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, g8x.getName());
        }
        return 0Yt.A0B(A1H);
    }
}
