package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class EPe extends C319156q8 {
    public final G5B A01() {
        G5B g5b;
        UserSession userSession = this.A01.A09;
        if (!DbT.A0j(userSession).A1W() || AnonymousClass7TE.A0q(userSession).getBoolean("shopping_has_tapped_orders_navbar_icon", false)) {
            g5b = C50691Fgq.A00;
        } else {
            g5b = new C50692Fgr(0);
        }
        return g5b;
    }

    public final void A02() {
        C323256xC r0 = this.A01;
        UserSession userSession = r0.A09;
        Context context = r0.A05;
        DbW.A1L(AnonymousClass7TF.A0N(userSession), "shopping_has_tapped_orders_navbar_icon");
        String string = context.getResources().getString(2131969086);
        1WM.getInstance();
        T8B A01 = new T8B(userSession).A01(Pxd.A00(505));
        A01.A07 = string;
        A01.A02(context);
    }
}
