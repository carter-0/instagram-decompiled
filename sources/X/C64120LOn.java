package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.LOn  reason: case insensitive filesystem */
public final class C64120LOn {
    public final String A00;
    public final JSONObject A01;

    public C64120LOn(String str, JSONObject jSONObject) {
        0qQ.A0B(jSONObject, 1);
        this.A01 = jSONObject;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64120LOn) {
                C64120LOn lOn = (C64120LOn) obj;
                if (!0qQ.A0K(this.A01, lOn.A01) || !0qQ.A0K(this.A00, lOn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C64120LOn lOn, C64164LRf lRf) {
        JSONObject jSONObject = lOn.A01;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "odr_pose_data_event");
        jSONObject2.put("data", jSONObject);
        lRf.A0D.A02.A00(jSONObject2);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SceneAssets(sceneJSONObject=");
        A1A.append(this.A01);
        A1A.append(", posePath=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
