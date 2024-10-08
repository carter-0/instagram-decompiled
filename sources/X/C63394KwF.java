package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.KwF  reason: case insensitive filesystem */
public abstract class C63394KwF {
    public static final void A00(UserSession userSession, String str, String str2, String str3, String str4, 0sm r11) {
        String str5;
        0qQ.A0B(userSession, 0);
        boolean A00 = C363558jv.A00(userSession);
        boolean A002 = C363018iu.A00(userSession);
        if (str2 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_fb_xposting_client");
            16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
            DbS.A1N(A0e, str2);
            A0e.AAJ(TraceFieldType.AdhocEventName, str);
            A0e.AAJ("waterfall_id", str4);
            A0e.AAJ("ig_userid", userSession.A06);
            A0e.A7p("feed_auto_xposting_status", JTP.A0g(A0e, Dbm.A00(), str3, A00));
            A0e.A7p("story_auto_xposting_status", Boolean.valueOf(A002));
            if (A0J != null) {
                str5 = String.valueOf(A0J.A00);
            } else {
                str5 = null;
            }
            A0e.AAJ("ig_user_account_type", str5);
            if (r11 == null) {
                r11 = 0Yt.A0E();
            }
            A0e.A9H("story_pinned_elements", r11);
            A0e.Cgf();
        }
    }
}
