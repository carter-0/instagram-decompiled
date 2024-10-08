package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.RUi  reason: case insensitive filesystem */
public abstract class C9231RUi {
    public static final void A00(String str, JSONObject jSONObject) {
        jSONObject.accumulate(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS, DbS.A11().put("prf", DbS.A11().put("eval", DbS.A11().put("first", str))));
    }
}
