package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.EPg  reason: case insensitive filesystem */
public final class C47974EPg extends C319156q8 {
    public final UserSession A00;

    public C47974EPg(UserSession userSession, C323256xC r6) {
        super(r6, (C319176qA) new EPS(new C51610Fwy(userSession)), "tap_shopping_bag", (int) R.drawable.instagram_shopping_cart_pano_outline_24);
        this.A00 = userSession;
    }

    public final G5B A01() {
        G5B g5b;
        UserSession userSession = this.A00;
        if (AnonymousClass7TE.A0q(userSession).getBoolean("has_tapped_on_shopping_bag_menu_option", false) || !AnonymousClass7TE.A0q(userSession).getBoolean("has_used_shopping_bag", false)) {
            g5b = C50691Fgq.A00;
        } else {
            g5b = new C50692Fgr(0);
        }
        return g5b;
    }

    public final void A02() {
        C323256xC r3 = this.A01;
        C249713kF r0 = C249713kF.A00;
        UserSession userSession = r3.A09;
        int A0A = AnonymousClass7TG.A0A(r0.A0Y(userSession));
        2aT A0c = DbU.A0c(userSession);
        2aX r1 = new 2aX(2aD.A0g, A0A);
        AnonymousClass2g1 r02 = AnonymousClass2g1.PROFILE_MENU;
        C226252fx r5 = C226252fx.NUMBERED;
        A0c.A01(r5, r02, r1);
        2aV A0a = DbV.A0a(userSession);
        2aX r2 = new 2aX(2aD.A0b, A0A);
        AnonymousClass2g1 r12 = AnonymousClass2g1.TOP_NAVIGATION_BAR;
        0qQ.A0B(r12, 0);
        A0a.A03(new C239993Jd(r5, r12, (C71062aE) null, (Set) null), r2, false);
        C249713kF.A00.A1H(userSession, Integer.valueOf(A0A), (String) null, "profile_menu");
        DbW.A1L(AnonymousClass7TF.A0N(userSession), "has_tapped_on_shopping_bag_menu_option");
        C249713kF.A00.A0p(r3.A06, V1Z.CART_BUTTON, V1W.PROFILE, V1Y.MENU_BOTTOMSHEET, V1X.HOME_FEED, userSession, (String) null, r3.A0A.getModuleName(), "side_tray_profile", (String) null, (String) null, (String) null, false);
    }
}
