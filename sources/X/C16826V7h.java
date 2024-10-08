package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7h  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16826V7h {
    public static Map A00(XAP xap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xap.BNi() != null) {
            linkedHashMap.put("location", xap.BNi());
        }
        if (xap.CAf() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, xap.CAf());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
