package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.WFr  reason: case insensitive filesystem */
public final class C18990WFr implements C41802B1h {
    public final /* synthetic */ UYH A00;

    public C18990WFr(UYH uyh) {
        this.A00 = uyh;
    }

    public final boolean AFV(JSONObject jSONObject) {
        if (!jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) || !"onEffectInitilization".equals(jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return false;
        }
        return true;
    }

    public final void CI3(JSONObject jSONObject) {
        String str;
        UYH uyh = this.A00;
        Integer A04 = uyh.A04();
        Integer num = AnonymousClass05K.A00;
        A9C a9c = uyh.A08;
        if (a9c != null) {
            if (A04 == num) {
                num = AnonymousClass05K.A01;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "onAR3DToggleSwitchStateChanged");
            JSONObject jSONObject3 = new JSONObject();
            if (num.intValue() != 0) {
                str = "AR";
            } else {
                str = "3D";
            }
            jSONObject3.put("newValue", str);
            jSONObject2.put("data", jSONObject3);
            a9c.A00(jSONObject2);
            return;
        }
        0qQ.A0F("renderProvider");
        throw AnonymousClass00P.createAndThrow();
    }
}
