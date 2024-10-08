package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.android.billingclient.api.SkuDetails;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.HashMap;

/* renamed from: X.TWv  reason: case insensitive filesystem */
public final class C13361TWv extends 0Yg implements 0sP {
    public static final C13361TWv A00 = new C13361TWv();

    public C13361TWv() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        HashMap A0x = C66582MXn.A0x(obj);
        A0x.put("productId", obj);
        A0x.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "inapp");
        A0x.put(DialogModule.KEY_TITLE, "mock title");
        A0x.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mock title");
        A0x.put("price", "$0.99");
        A0x.put("price_amount_micros", "990000");
        return new SkuDetails(JTQ.A0c(A0x));
    }
}
