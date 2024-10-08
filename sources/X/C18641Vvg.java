package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vvg  reason: case insensitive filesystem */
public final class C18641Vvg {
    public final AnonymousClass07i A00;
    public final C228602lw A01;
    public final UserSession A02;

    public static void A00(C18641Vvg vvg, 1P0 r1, 1OC r2) {
        r2.A00 = r1;
        vvg.A01.schedule(r2);
    }

    public final void A01(1P0 r7, String str) {
        2IS r5 = new 2IS();
        UserSession userSession = this.A02;
        r5.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, userSession.A06);
        r5.A04("callsite", str);
        if (str.equals("INBOX")) {
            r5.A02("should_create_if_not_existed", AnonymousClass7TE.A0v());
        }
        C363088j4 A002 = C363088j4.A00(userSession);
        C239113Fa r3 = new C239113Fa(r5, UJH.class, "AdToolsHighlightsHubQuery", false);
        A002.ATL(new C19026WHc(2), new C19040WHs(r7, 3), r3);
    }

    public final void A02(1P0 r4, String str, String str2) {
        1NY A0L = DbZ.A0L(this.A02);
        A0L.A0A("ads/ads_manager/get_or_enroll_coupon/");
        A0L.A0G("fb_auth_token", str);
        if (str2 != null) {
            A0L.A9m("coupon_offer_id", str2);
        }
        A00(this, r4, DbU.A0S(A0L, PromoteEnrollCouponInfo.class, C18171Vml.class));
    }

    public final void A03(1P0 r4, String str, String str2, String str3) {
        UserSession userSession = this.A02;
        String str4 = WGU.A00(userSession).A03;
        AnonymousClass7TF.A1D(userSession, 0, str4);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        C51968G9o.A1K(A0a, "ads/ads_manager/pause_promotion_v2/", str);
        A0a.A9m("fb_auth_token", str3);
        A0a.A0G("flow_id", str4);
        A0a.A0G("boosted_id", str2);
        A00(this, r4, DbU.A0S(A0a, UXS.class, C18148VmO.class));
    }

    public C18641Vvg(Context context, AnonymousClass07Z r4, UserSession userSession) {
        this.A02 = userSession;
        0gy A002 = AnonymousClass07i.A00(r4);
        this.A00 = A002;
        this.A01 = new C228602lw(context, A002);
    }
}
