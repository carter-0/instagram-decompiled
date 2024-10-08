package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.7yo  reason: invalid class name and case insensitive filesystem */
public final class C348657yo extends AnonymousClass3FZ implements C348667yp {
    public final String AjI() {
        return A05("cache_key");
    }

    public final ImmutableList C1p() {
        return A01("string_identifiers");
    }

    public final String getId() {
        return A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public final String getUri() {
        return A05("uri");
    }

    public C348657yo(JSONObject jSONObject) {
        super(jSONObject);
    }
}
