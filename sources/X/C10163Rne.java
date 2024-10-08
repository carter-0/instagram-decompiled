package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import org.json.JSONObject;

/* renamed from: X.Rne  reason: case insensitive filesystem */
public final class C10163Rne {
    public final C10769Rxn A00;

    public C10163Rne(JSONObject jSONObject) {
        C10769Rxn rxn;
        jSONObject.getString("productId");
        jSONObject.optString(DialogModule.KEY_TITLE);
        jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        jSONObject.optString(DevServerEntity.COLUMN_DESCRIPTION);
        jSONObject.optString("basePlanId");
        JSONObject optJSONObject = jSONObject.optJSONObject("pricingPhase");
        if (optJSONObject == null) {
            rxn = null;
        } else {
            rxn = new C10769Rxn(optJSONObject);
        }
        this.A00 = rxn;
    }
}
