package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class W9g implements View.OnClickListener {
    public final /* synthetic */ C323536xe A00;
    public final /* synthetic */ Integer A01;

    public W9g(C323536xe r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public final void onClick(View view) {
        V1X v1x;
        V1W v1w;
        int A05 = AnonymousClass0fD.A05(-1890084979);
        C323536xe r2 = this.A00;
        String str = r2.A0F;
        int hashCode = str.hashCode();
        String A002 = AnonymousClass000.A00(3785);
        if (hashCode == -851590075) {
            if (str.equals("instagram_shopping_home_video")) {
                v1x = V1X.LIVE_SHOPPING;
            }
            v1x = V1X.SHOP_HOME;
        } else if (hashCode != -547803026) {
            if (hashCode == 2017970797 && str.equals(A002)) {
                v1x = V1X.PRODUCT_DETAILS;
            }
            v1x = V1X.SHOP_HOME;
        } else {
            if (str.equals("instagram_shopping_reconsideration_destination")) {
                v1x = V1X.CONTINUE_SHOPPING;
            }
            v1x = V1X.SHOP_HOME;
        }
        if (str.equals(A002)) {
            v1w = V1W.PDP;
        } else {
            v1w = V1W.SHOP_HOME;
        }
        C249713kF r4 = r2.A0C;
        UserSession userSession = r2.A09;
        String str2 = r2.A0H;
        r4.A1H(userSession, this.A01, str2, str);
        r4.A0o(r2.A02, V1Z.CART_BUTTON, v1w, V1Y.NAVIGATION_BAR, v1x, userSession, str2, str, r2.A0D, r2.A0G, r2.A0I, r2.A0E, (String) null, false);
        AnonymousClass0fD.A0C(1376257743, A05);
    }
}
