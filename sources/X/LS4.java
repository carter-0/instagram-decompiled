package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public abstract class LS4 {
    public static final 0xG A00 = DbS.A0O("reel_loading_error_logger");

    public static void A00(0Aj r2, 0qV r3, String str, String str2) {
        r2.AAJ("error_type", str);
        r2.AAJ(C273654mx.A00(834), 0qT.A00(r3.A00));
        r2.AAJ(C273654mx.A00(835), C61970qY.A06());
        r2.AAJ(C273654mx.A00(836), 0qU.A00(r3.A01));
        r2.AAJ(C273654mx.A00(922), str2);
    }

    public static final void A01(UserSession userSession, String str, String str2) {
        DbY.A1S(str, userSession);
        0qV A04 = C61970qY.A04();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A00, userSession), C273654mx.A00(377));
        A00(A0e, A04, str2, str);
        A0e.A9F(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AnonymousClass7TE.A10(userSession.A06));
        A0e.Cgf();
    }

    public static final void A02(UserSession userSession, String str, String str2, String str3) {
        AnonymousClass7TG.A1Q(str3, userSession);
        0qV A04 = C61970qY.A04();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A00, userSession), C273654mx.A00(377));
        A00(A0e, A04, str2, str3);
        if (str == null) {
            str = "";
        }
        A0e.AAJ("reel_id", str);
        A0e.A9F(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AnonymousClass7TE.A10(userSession.A06));
        A0e.Cgf();
    }
}
