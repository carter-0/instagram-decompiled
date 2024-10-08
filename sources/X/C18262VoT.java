package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.VoT  reason: case insensitive filesystem */
public abstract class C18262VoT {
    public static void A01(Context context, AnonymousClass07i r4, UserSession userSession, X6x x6x, String str, String str2) {
        1OC A00 = A00(userSession, String.valueOf(0nA.A09(context)), str, str2, (String) null);
        A00.A00 = new C15620Ufm(x6x, userSession, str, 4);
        1ES.A00(context, r4, A00);
    }

    public static 1OC A00(UserSession userSession, String str, String str2, String str3, String str4) {
        1NY A0O = DbU.A0O(userSession);
        A0O.A0K("commerce/products/%s/group/", new Object[]{str2});
        A0O.A0G("source_media_id", str4);
        A0O.A9m("merchant_id", str3);
        A0O.A9m("device_width", str);
        A0O.A9m("include_variant_specific_sectional_items", "false");
        A0O.A9m("shopping_bag_enabled", "false");
        return DbT.A0S(A0O, C15241UXb.class, C18263VoU.class);
    }
}
