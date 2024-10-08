package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WFq  reason: case insensitive filesystem */
public final class C18989WFq implements C41802B1h {
    public final WT1 A00;

    public C18989WFq(WT1 wt1) {
        0qQ.A0B(wt1, 1);
        this.A00 = wt1;
    }

    public final boolean AFV(JSONObject jSONObject) {
        if (!jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) || !"loggingEvent".equals(jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return false;
        }
        return true;
    }

    public final void CI3(JSONObject jSONObject) {
        if (AFV(jSONObject)) {
            try {
                Object obj = jSONObject.getJSONObject("data").get("logType");
                for (C16603Uxx uxx : C16603Uxx.values()) {
                    if (0qQ.A0K(uxx.A01, obj)) {
                        WT1.A00(uxx.A00, this.A00);
                        return;
                    }
                }
            } catch (JSONException e) {
                this.A00.A02(C16612Uy8.PLATFORM_EVENT_PARSING_ERROR, "", AnonymousClass7TG.A0m(e, "Can not parse platform event: ", new StringBuilder()));
            }
        }
    }
}
