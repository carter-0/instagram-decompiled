package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.LJs  reason: case insensitive filesystem */
public abstract class C64029LJs {
    public static final void A00(UserSession userSession, String str) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "ig_fb_xposting_client");
        16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
        A0e.AAJ(TraceFieldType.AdhocEventName, str);
        A0e.AAJ("ig_userid", userSession.A06);
        if (A0J != null) {
            str2 = String.valueOf(A0J.A00);
        } else {
            str2 = null;
        }
        A0e.AAJ("ig_user_account_type", str2);
        A0e.Cgf();
    }

    public static final void A01(UserSession userSession, String str, String str2, String str3) {
        String str4;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "ig_fb_xposting_client");
        16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
        DbS.A1N(A0e, str2);
        A0e.AAJ(TraceFieldType.AdhocEventName, str);
        A0e.AAJ("waterfall_id", str3);
        A0e.AAJ("ig_userid", userSession.A06);
        if (A0J != null) {
            str4 = String.valueOf(A0J.A00);
        } else {
            str4 = null;
        }
        A0e.AAJ("ig_user_account_type", str4);
        A0e.Cgf();
    }
}
