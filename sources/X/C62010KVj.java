package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KVj  reason: case insensitive filesystem */
public final class C62010KVj extends C64837Liz {
    public static C62010KVj A02;
    public final 0wc A00;
    public final C64090LMi A01 = new C64090LMi();

    public final void onUserSessionWillEnd(boolean z) {
        A02 = null;
    }

    public final void A00(int i) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_user_pay_badge_count_updated");
        C64090LMi lMi = this.A01;
        C64090LMi.A00(A0e, lMi, "media_id", lMi.A02);
        A0e.A9F("count", DbV.A0p(A0e, "product_type", lMi.A03, i));
        A0e.Cgf();
    }

    public final void A01(Integer num, String str, String str2, String str3) {
        String str4;
        if (str != null) {
            C64090LMi lMi = this.A01;
            String str5 = (String) 00k.A0J(DbV.A18(str, "_"));
            if (str5 != null) {
                str = str5;
            }
            lMi.A02 = str;
        }
        if (str2 != null) {
            this.A01.A00 = str2;
        }
        C64090LMi lMi2 = this.A01;
        switch (num.intValue()) {
            case 1:
                str4 = "live_supporter_list";
                break;
            case 2:
                str4 = "live_broadcast_ending";
                break;
            case 3:
                str4 = "reel_multiedit_composer";
                break;
            case 4:
                str4 = "live";
                break;
            case 5:
                str4 = "igtv";
                break;
            default:
                str4 = "creator_profile";
                break;
        }
        lMi2.A01 = str4;
        if (str3 != null) {
            lMi2.A03 = str3;
        }
    }

    public C62010KVj(UserSession userSession) {
        this.A00 = AnonymousClass0kN.A02(userSession);
    }
}
