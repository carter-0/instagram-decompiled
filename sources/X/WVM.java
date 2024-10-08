package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import com.instagram.user.model.Product;

public final class WVM implements C51868G5f {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Yk A01;
    public final /* synthetic */ ShoppingNavigationInfo A02;
    public final /* synthetic */ Product A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public WVM(UserSession userSession, 1Yk r2, ShoppingNavigationInfo shoppingNavigationInfo, Product product, String str, String str2) {
        this.A01 = r2;
        this.A03 = product;
        this.A00 = userSession;
        this.A02 = shoppingNavigationInfo;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void Dj9(String str) {
        Long l;
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            WPV wpv = new WPV(this);
            Product product = this.A03;
            UserSession userSession = this.A00;
            C15054ULx A032 = C294165ly.A03(userSession, product);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(wpv, userSession), "instagram_shopping_pdp_message_merchant_send");
            C15054ULx.A02(A0e, A032);
            Boolean bool = A032.A04;
            bool.getClass();
            A0e.A7p("is_checkout_enabled", bool);
            Boolean bool2 = A032.A02;
            bool2.getClass();
            A0e.A7p("can_add_to_bag", bool2);
            C13991Tnr.A11(A0e, str.length());
            C13988Tno.A17(A0e, this.A02.A00());
            String str2 = this.A04;
            if (!0mp.A0B(str2)) {
                l = DbV.A0q(str2);
            } else {
                l = null;
            }
            A0e.A9F("collection_page_id", l);
            A0e.Cgf();
            1as.A04.A0E(userSession, product, this.A05, "message_merchant", trim);
        }
    }
}
