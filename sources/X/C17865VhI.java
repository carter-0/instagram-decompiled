package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.VhI  reason: case insensitive filesystem */
public final class C17865VhI {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final String A03;

    public final void A00(Product product, String str, String str2, String str3, String str4) {
        C15054ULx A032 = C294165ly.A03(this.A01, product);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_shopping_camera_action");
        C15054ULx.A02(A0e, A032);
        DbS.A1J(A0e, str);
        if (str3 == null) {
            str3 = "unknown";
        }
        A0e.AAJ("prior_submodule", str3);
        C13988Tno.A1D(A0e, this.A03);
        boolean z = false;
        A0e.A7p("is_checkout_enabled", Boolean.valueOf(AnonymousClass7TG.A1X(A032.A04)));
        Boolean bool = A032.A02;
        if (bool != null) {
            z = bool.booleanValue();
        }
        A0e.A7p("can_add_to_bag", Boolean.valueOf(z));
        C13988Tno.A1C(A0e, str2);
        A0e.AAJ("checkout_session_id", str4);
        A0e.A7p("has_drops_launched", A032.A03);
        A0e.A9F("drops_launch_date", A032.A06);
        A0e.AAJ("url", product.A0F);
        A0e.Cgf();
    }

    public C17865VhI(UserSession userSession, AnonymousClass4DU r3, String str) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A03 = str;
        this.A00 = AnonymousClass0kN.A01(r3, userSession);
    }
}
