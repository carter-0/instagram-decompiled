package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.Xxn  reason: case insensitive filesystem */
public final class C22232Xxn implements AnonymousClass153 {
    public final int Bcx() {
        return 2;
    }

    public final int Bcy() {
        return 1;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "qualcomm");
            jSONObject.put("framework", "Codeaurora");
            jSONObject.put("extra", "");
            jSONObject.put("access", AnonymousClass4EH.A02.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final 14s ALZ(AnonymousClass155 r5, AnonymousClass15J r6) {
        int[] Ah3 = r5.Ah3(r6);
        if (Ah3.length == 0) {
            return null;
        }
        return new XMU(new AnonymousClass4EH(), Ah3, r6.A00);
    }
}
