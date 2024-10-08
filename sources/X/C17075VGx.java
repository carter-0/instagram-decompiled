package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.VGx  reason: case insensitive filesystem */
public abstract class C17075VGx {
    public static final void A00(Context context, AnonymousClass0iw r7, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        if (!AnonymousClass7TE.A0q(userSession).getBoolean("has_shown_featured_products_seller_nux", false)) {
            0wc A01 = AnonymousClass0kN.A01(r7, userSession);
            C358248ab r4 = new C358248ab(context);
            r4.A0i(context.getDrawable(R.drawable.ig_illustrations_illo_add_photos_videos_refresh));
            r4.A09(2131962221);
            r4.A08(2131962224);
            r4.A06();
            r4.A0G(new C50018FJd((Object) context, (Object) A01, str, 9), 2131964884);
            DbT.A1V(r4);
            0Aj A0e = AnonymousClass7TE.A0e(A01, "instagram_shopping_seller_featured_product_nux_impression");
            C13988Tno.A19(A0e, new 0bb(), "prior_module", str);
            A0e.Cgf();
            DbW.A1L(AnonymousClass7TF.A0N(userSession), "has_shown_featured_products_seller_nux");
        }
    }
}
