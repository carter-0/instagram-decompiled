package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FYn  reason: case insensitive filesystem */
public final class C50332FYn implements AnonymousClass0lh {
    public final 0wc A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C50332FYn(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        0xG A0O = DbS.A0O("CreatorMonetizationLogger");
        this.A01 = A0O;
        this.A00 = AnonymousClass0kN.A01(A0O, userSession);
    }

    public final void A02(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        0qQ.A0B(str5, 4);
        0Aj A03 = Dbc.A03(this.A00, "ig_creator_monetization_onboarding_flow", str, str2, str5);
        DbS.A1H(A03, str4);
        DbS.A1J(A03, str3);
        EZV ezv = null;
        if (str6 != null) {
            try {
                ezv = EZV.valueOf(str6);
            } catch (IllegalArgumentException unused) {
            }
        }
        A03.A8M(ezv, "origin");
        A03.AAJ("client_extra", str7);
        A03.Cgf();
    }

    public final void A00(EZV ezv, String str, String str2, String str3) {
        0Aj A03 = Dbc.A03(this.A00, "ig_user_pay_badges_see_supporters", "live", "badges", str);
        A03.A8M(ezv, "origin");
        A03.AAJ("media_id", str2);
        A03.AAJ(AnonymousClass000.A00(659), str3);
        A03.Cgf();
    }

    public final void A01(EZV ezv, String str, String str2, String str3) {
        0Aj A03 = Dbc.A03(this.A00, "ig_user_pay_badges_supporters_list_supporter_tap", "live", "badges", AnonymousClass000.A00(4411));
        A03.A8M(ezv, "origin");
        DbU.A1N(A03, "supporter_id", str, str2);
        A03.AAJ(AnonymousClass000.A00(659), str3);
        A03.Cgf();
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C50332FYn.class);
    }
}
