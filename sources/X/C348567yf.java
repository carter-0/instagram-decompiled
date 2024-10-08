package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.7yf  reason: invalid class name and case insensitive filesystem */
public final class C348567yf extends AnonymousClass3FZ implements C348577yg {
    public final ImmutableList AlI() {
        return A02("capabilities_min_version_models", C348707yt.class);
    }

    public final String BOu() {
        return A05("manifest_json");
    }

    public final C348597yi Ba7() {
        return (C348597yi) A00(C348587yh.class, "packaged_file");
    }

    public final boolean CDA() {
        return A06("uses_flm_capability");
    }

    public final String getId() {
        return A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public C348567yf(JSONObject jSONObject) {
        super(jSONObject);
    }
}
