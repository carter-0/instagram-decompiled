package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EdG  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48359EdG {
    public static Map A00(C267504bf r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Ava() != null) {
            A1H.put(AnonymousClass000.A00(584), r3.Ava());
        }
        if (r3.B9k() != null) {
            A1H.put(AnonymousClass000.A00(620), r3.B9k());
        }
        if (r3.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.getId());
        }
        if (r3.BzL() != null) {
            XFBYPRequestStatus BzL = r3.BzL();
            if (BzL != null) {
                str = BzL.A00;
            } else {
                str = null;
            }
            A1H.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        }
        return 0Yt.A0B(A1H);
    }
}
