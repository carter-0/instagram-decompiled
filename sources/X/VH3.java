package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.User;

public abstract class VH3 {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r24, UnavailableProduct unavailableProduct, String str, String str2) {
        String str3;
        String str4 = "";
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r10 = r24;
        String str5 = str;
        String str6 = str2;
        if (AnonymousClass7TF.A1Y(unavailableProduct.BRo().A03.Bvx(), true)) {
            C249713kF r6 = C249713kF.A00;
            User BRo = unavailableProduct.BRo();
            if (BRo != null) {
                str3 = BRo.getId();
            } else {
                str3 = str4;
            }
            User BRo2 = unavailableProduct.BRo();
            if (BRo2 != null) {
                str4 = BRo2.getUsername();
            }
            r6.A0N(fragmentActivity2, unavailableProduct.BRo().A03.BsB(), userSession2, r10, str5, str6, "unavailable_product_card", str3, str4).A05();
            return;
        }
        String productId = unavailableProduct.getProductId();
        0qQ.A0B(productId, 0);
        WWW www = new WWW(productId);
        C233822wX.A0K(userSession2, new WWV(str6, r10, 1), HLF.BRAND, www, r10, new C19826Wg7(str5), (Integer) null, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, false);
        C309516Yo r2 = new C309516Yo(fragmentActivity2, userSession2);
        1a1 A02 = C46447Df9.A02();
        User BRo3 = unavailableProduct.BRo();
        if (BRo3 != null) {
            str4 = BRo3.getUsername();
        }
        C46474Dfc A022 = C46548Dgp.A02(userSession2, str4, "shopping_saved_product", r10.getModuleName());
        A022.A0L = str5;
        r2.A0B((Bundle) null, A02.A02(userSession2, A022.A04()));
        r2.A04();
    }
}
