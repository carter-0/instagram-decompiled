package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import org.json.JSONObject;

/* renamed from: X.UJb  reason: case insensitive filesystem */
public final class C15001UJb extends AnonymousClass3FZ implements MXC {
    public final String AqT() {
        return A05("content");
    }

    public final C16658Uyu CAY() {
        return (C16658Uyu) A04(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C16658Uyu.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final String getTitle() {
        return A05(DialogModule.KEY_TITLE);
    }

    public final String getUrl() {
        return A05("url");
    }

    public C15001UJb(JSONObject jSONObject) {
        super(jSONObject);
    }
}
