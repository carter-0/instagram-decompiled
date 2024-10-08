package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.W2b  reason: case insensitive filesystem */
public final class C18794W2b {
    public static final C18794W2b A00 = new Object();

    public static final void A00(Context context, AnonymousClass07i r4, X6S x6s, UserSession userSession) {
        0qQ.A0B(r4, 1);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A(AnonymousClass000.A00(2582));
        1OC A0S = DbU.A0S(A0a, UX1.class, C18140VmG.class);
        C15621Ufn.A00(A0S, x6s, 24);
        1ES.A00(context, r4, A0S);
    }

    public static final void A01(Context context, AnonymousClass07i r7, X6S x6s, UserSession userSession) {
        AnonymousClass7TF.A1B(context, 0, userSession);
        A03(context, r7, new C19184WOq(context, r7, x6s, userSession, false), userSession);
    }

    public static final void A02(Context context, AnonymousClass07i r11, X6S x6s, UserSession userSession, boolean z) {
        UserSession userSession2 = userSession;
        if (!z) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36318024411649798L) || 182.A06(r2, userSession, 36318024411780871L)) {
                x6s.E4Q("");
                return;
            }
        }
        VMZ A002 = C16905VAi.A00(userSession);
        String str = A002.A00;
        Context context2 = context;
        AnonymousClass07i r5 = r11;
        if (str != null) {
            C19186WOs wOs = new C19186WOs(context2, r5, A002, new C19182WOo((Object) x6s, 2), userSession2, str);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("ads/promote/validate_business_user_access_token/");
            A0a.A9m("business_user_access_token", str);
            1OC A0S = DbU.A0S(A0a, UX2.class, C18141VmH.class);
            C15621Ufn.A00(A0S, wOs, 25);
            1ES.A00(context, r11, A0S);
            return;
        }
        A00(context, r11, new C19179WOl(2, A002, x6s), userSession);
    }

    public static final void A03(Context context, AnonymousClass07i r4, X6T x6t, UserSession userSession) {
        0qQ.A0B(r4, 1);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("ads/promote/fetch_experiment_config/");
        1OC A0S = DbU.A0S(A0a, UXR.class, C18142VmI.class);
        C15621Ufn.A00(A0S, x6t, 23);
        1ES.A00(context, r4, A0S);
    }
}
