package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Tr2  reason: case insensitive filesystem */
public final class C14164Tr2 implements AnonymousClass0iw {
    public static final C14164Tr2 A00 = new Object();
    public static final String __redex_internal_original_name = "SuperlativeLoggingUtils";

    public static final void A01(String str, String str2) {
        0qQ.A0B(str2, 1);
        0wb.A03(AnonymousClass000.A00(2504), 002.A0g(str, " : ", str2));
    }

    public final void A02(UserSession userSession, Reel reel, AnonymousClass3BQ r8) {
        0qQ.A0B(userSession, 0);
        if (reel.A0t()) {
            0wc A01 = AnonymousClass0kN.A01(this, userSession);
            String A0j = AnonymousClass7TG.A0j();
            List A0O = reel.A0O(userSession);
            0qQ.A07(A0O);
            for (C255773uh A1J : 00k.A0a(A0O)) {
                C13990Tnq.A1J(A01, A1J, r8, "ig_story_standouts_card_eligible", A0j);
            }
        }
    }

    public final String getModuleName() {
        return "standouts";
    }

    public static final 28D A00(AnonymousClass3BQ r0) {
        switch (r0.ordinal()) {
            case 0:
                return 28D.A56;
            case 105:
                return 28D.A59;
            case 106:
                return 28D.A54;
            case 107:
                return 28D.A57;
            case 108:
                return 28D.A55;
            case 109:
                return 28D.A58;
            case 110:
                return 28D.A5A;
            default:
                return 28D.A5J;
        }
    }

    public final void A03(UserSession userSession, C255773uh r5, AnonymousClass3BQ r6) {
        DbY.A1S(userSession, r6);
        if (r5.A1k()) {
            C13990Tnq.A1J(AnonymousClass0kN.A01(this, userSession), r5, r6, "ig_story_standouts_card_impression", AnonymousClass7TG.A0j());
        }
    }

    public final void A04(UserSession userSession, AnonymousClass3BQ r5, String str) {
        AnonymousClass7TG.A1T(userSession, str, r5);
        0wc A01 = AnonymousClass0kN.A01(this, userSession);
        String A0j = AnonymousClass7TG.A0j();
        0Aj A0e = AnonymousClass7TE.A0e(A01, "ig_story_standouts_ineligible_bottom_sheet_impression");
        if (A0e.isSampled()) {
            C51965G9l.A1L(A0e, A0j);
            A0e.AAJ("reel_id_type", C273654mx.A00(192));
            A0e.AAJ("reel_id", str);
            DbV.A1J(A0e, A00(r5).name());
        }
    }
}
