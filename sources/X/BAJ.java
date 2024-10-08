package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

public final class BAJ extends AnonymousClass3FZ implements DaA {
    public final DYM BGb() {
        return (DYM) A00(BAG.class, "impression_settings");
    }

    public final DYN BJf() {
        return (DYN) A00(BAH.class, "ixt_flow_target");
    }

    public final ImmutableList C4V() {
        return A02("targets", BAI.class);
    }

    public final String CAh() {
        return A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public final int getPriority() {
        return this.A00.optInt("priority");
    }

    public BAJ(JSONObject jSONObject) {
        super(jSONObject);
    }
}
