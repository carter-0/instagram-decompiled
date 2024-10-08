package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VGr  reason: case insensitive filesystem */
public abstract class C17069VGr {
    public static final 1OC A00(UserSession userSession, String str, String str2, String str3) {
        AnonymousClass7TG.A1T(userSession, str, str2);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("commerce/media_for_product/");
        A0b.A0Q(C43825CEr.class, D09.class);
        A0b.A9m("product_id", str);
        JTO.A1W(A0b, str3);
        return DbT.A0T(A0b, "merchant_id", str2);
    }
}
