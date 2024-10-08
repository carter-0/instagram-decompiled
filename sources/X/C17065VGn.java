package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import org.json.JSONObject;

/* renamed from: X.VGn  reason: case insensitive filesystem */
public abstract class C17065VGn {
    public static final void A00(Context context, AnonymousClass07i r6, UserSession userSession, C20969X6w x6w, Product product, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C51973G9u.A0r(2, userSession, str, str2);
        JSONObject A04 = C278474ww.A04(userSession);
        String str6 = product.A0H;
        if (z) {
            str5 = "ads/app/products/%s/hero_carousel_content/";
        } else {
            str5 = "commerce/products/%s/hero_carousel_content/";
        }
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0K(str5, new Object[]{str6});
        A0b.A9m("merchant_id", str2);
        A0b.A0G("permission_id", str4);
        A0b.A9m("device_capabilities", A04.toString());
        A0b.A9m("device_width", String.valueOf(0nA.A09(context)));
        A0b.A0Q(C15240UXa.class, C45702D2b.class);
        if (str.equals(str6)) {
            A0b.A0G("pinned_media_id", str3);
            A0b.A9m("should_show_all_catalogs_last", "true");
        }
        1OC A0M = A0b.A0M();
        C15622Ufo.A00(A0M, x6w, 6);
        1ES.A00(context, r6, A0M);
    }
}
