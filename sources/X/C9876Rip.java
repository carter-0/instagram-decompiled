package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.google.gson.JsonElement;

/* renamed from: X.Rip  reason: case insensitive filesystem */
public abstract class C9876Rip {
    public static final void A00(String str, JsonElement jsonElement) {
        0kD.A0I("Failed to parse swipe history entry", (Throwable) null, DbY.A0p(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, jsonElement.toString(), AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str)));
    }
}
