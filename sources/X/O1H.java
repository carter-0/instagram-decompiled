package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.featuredproduct.SurfaceVisibility;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class O1H {
    public static Map A00(C74546Pwf pwf) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (pwf.BEY() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, pwf.BEY());
        }
        String str2 = null;
        if (pwf.BzM() != null) {
            FeaturedProductPermissionStatus BzM = pwf.BzM();
            if (BzM != null) {
                str = BzM.A00;
            } else {
                str = null;
            }
            A1H.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        }
        if (pwf.C3M() != null) {
            SurfaceVisibility C3M = pwf.C3M();
            if (C3M != null) {
                str2 = C3M.A00;
            }
            A1H.put("surface_visibility", str2);
        }
        return 0Yt.A0B(A1H);
    }
}
