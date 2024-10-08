package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WFs  reason: case insensitive filesystem */
public final class C18991WFs implements C41802B1h {
    public final /* synthetic */ UYH A00;

    public C18991WFs(UYH uyh) {
        this.A00 = uyh;
    }

    public final boolean AFV(JSONObject jSONObject) {
        if (!jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) || !"onAR3DToggleSwitchVisibilityChanged".equals(jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return false;
        }
        return true;
    }

    public final void CI3(JSONObject jSONObject) {
        try {
            if (jSONObject.getJSONObject("data").getBoolean("newValue")) {
                UYH uyh = this.A00;
                Integer num = uyh.A09;
                if (num == null) {
                    0qQ.A0F("effectMode");
                    throw AnonymousClass00P.createAndThrow();
                } else if (num == AnonymousClass05K.A0C && uyh.A04() == AnonymousClass05K.A01) {
                    C342057ny.A00(new C19976Win(uyh));
                }
            }
        } catch (JSONException e) {
            this.A00.A02().A02(C16612Uy8.PLATFORM_EVENT_PARSING_ERROR, "", AnonymousClass7TG.A0m(e, "Can not parse platform event: ", new StringBuilder()));
        }
    }
}
