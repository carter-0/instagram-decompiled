package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.Xxm  reason: case insensitive filesystem */
public final class C22231Xxm implements AnonymousClass153 {
    public final int Bcx() {
        return 7;
    }

    public final int Bcy() {
        return 8;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "huawei");
            jSONObject.put("framework", "PerfHub");
            jSONObject.put("extra", "");
            jSONObject.put("access", Xnt.A02.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final 14s ALZ(AnonymousClass155 r6, AnonymousClass15J r7) {
        int[] Ah3 = r6.Ah3(r7);
        if (Ah3.length == 0) {
            return null;
        }
        int i = 8;
        if (Ah3[0] >= 90) {
            i = 4;
        }
        Ah3[0] = i;
        return new XMT(new Xnt(), Ah3, r7.A00);
    }
}
