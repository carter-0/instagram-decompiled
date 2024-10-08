package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FYh  reason: case insensitive filesystem */
public final class C50327FYh implements AnonymousClass0lh {
    public 0wc A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void A00(Integer num, String str, String str2, String str3) {
        String str4;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_creator_incentive_platform_reels_bonus_tagging");
        switch (num.intValue()) {
            case 0:
                str4 = "Entry impression";
                break;
            case 1:
                str4 = "Selection view impression";
                break;
            case 2:
                str4 = "Deal select";
                break;
            case 3:
                str4 = "Deal publish";
                break;
            case 4:
                str4 = "Self Reel Promo Impression";
                break;
            case 5:
                str4 = "Self Reel Promo Tap Primary Action";
                break;
            case 6:
                str4 = "Self Reel Promo Dismiss";
                break;
            case 7:
                str4 = "After Reel Creation Promo Impression";
                break;
            case 8:
                str4 = "After Reel Creation Promo Tap Primary Action";
                break;
            case 9:
                str4 = "After Reel Creation Promo Dismiss";
                break;
            default:
                str4 = "Promo Dialogs Request Error";
                break;
        }
        DbS.A1J(A0e, str4);
        DbS.A1O(A0e, this.A01.getModuleName());
        DbU.A1N(A0e, "tagged_deal_program_name", str, str2);
        A0e.AAJ("client_extra", str3);
        A0e.Cgf();
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C50327FYh.class);
    }

    public C50327FYh(UserSession userSession) {
        this.A02 = userSession;
        0xG A0O = DbS.A0O("IncentivePlatformLoggingHelper");
        this.A01 = A0O;
        this.A00 = AnonymousClass0kN.A01(A0O, userSession);
    }
}
