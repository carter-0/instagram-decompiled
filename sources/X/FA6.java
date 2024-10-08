package X;

import com.instagram.common.session.UserSession;

public final class FA6 {
    public final 0wc A00;
    public final UserSession A01;

    public FA6(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public static final void A00(FA6 fa6, String str, String str2, String str3, boolean z) {
        EZQ ezq;
        0Aj A0e = AnonymousClass7TE.A0e(fa6.A00, "ig_creator_ai_fan_onboarding");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A9F(AnonymousClass000.A00(1072), DbV.A0q(fa6.A01.A06));
            DbS.A1N(A0e, str2);
            A0e.A9F("target_user_id", AnonymousClass7TE.A10(str3));
            if (z) {
                ezq = EZQ.NEW;
            } else {
                ezq = EZQ.EXISTING;
            }
            A0e.A8M(ezq, AnonymousClass000.A00(380));
            A0e.Cgf();
        }
    }
}
