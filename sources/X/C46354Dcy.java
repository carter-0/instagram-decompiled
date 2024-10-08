package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dcy  reason: case insensitive filesystem */
public abstract class C46354Dcy {
    public static final Dd0 A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (Dd0) userSession.A01(Dd0.class, new C51797G2g(userSession, 24));
    }

    public static final FYX A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (FYX) userSession.A01(FYX.class, C46514DgH.A00);
    }

    public static void A03(C309516Yo r7, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        r7.A0E(A00(userSession, str, true, false, false, false, false));
        r7.A04();
    }

    public static final Fragment A00(UserSession userSession, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Fragment fragment;
        0eP[] r0;
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        if (182.A06(A0H, userSession, 36316357964337425L) || ("newsfeed_you".equals(str) && 182.A06(A0H, userSession, 36316357964992786L))) {
            fragment = new C47444E2q();
            r0 = AnonymousClass7TH.A0h("ARG_SHOW_SUGGESTED_USERS", Boolean.valueOf(z2), AnonymousClass7TE.A1L("ARG_ALLOW_TRUNCATE_FOLLOW_REQUESTS", Boolean.valueOf(z)), AnonymousClass7TE.A1L("ARG_HIDE_APPROVE_BUTTON", Boolean.valueOf(z3)), AnonymousClass7TE.A1L("ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER", Boolean.valueOf(z4)));
        } else {
            fragment = new C47525E6l();
            r0 = new 0eP[]{AnonymousClass7TE.A1L("ARG_ALLOW_TRUNCATE_FOLLOW_REQUESTS", Boolean.valueOf(z)), AnonymousClass7TE.A1L("ARG_HIDE_APPROVE_BUTTON", Boolean.valueOf(z3)), AnonymousClass7TE.A1L("ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER", Boolean.valueOf(z4)), AnonymousClass7TE.A1L("ARG_SHOW_SUGGESTED_USERS", Boolean.valueOf(z2)), AnonymousClass7TE.A1L(AnonymousClass000.A00(415), Boolean.valueOf(z5))};
        }
        DbT.A1N(fragment, r0);
        return fragment;
    }
}
