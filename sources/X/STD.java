package X;

import com.instagram.common.session.UserSession;

public abstract class STD {
    public static final void A06(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, String str4) {
        String str5;
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "av_view_loaded");
        if (A0e.isSampled()) {
            if (str == null) {
                str = "";
            }
            A01(A0e, str, str2, str3, str4);
            if (r2 != null) {
                str5 = r2.getModuleName();
            } else {
                str5 = null;
            }
            Pxi.A1C(A0e, str5);
        }
    }

    public static final long A00(String str) {
        Long A10;
        if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
            return 0;
        }
        return A10.longValue();
    }

    public static void A01(0Aj r2, String str, String str2, String str3, String str4) {
        r2.AAJ("av_session_id", str);
        r2.AAJ("flow", str2);
        r2.AAJ("step", str3);
        r2.A9F("flow_id", Long.valueOf(A00(str4)));
    }

    public static final void A02(AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "av_continue_tapped");
        if (A0e.isSampled()) {
            if (str == null) {
                str = "";
            }
            A01(A0e, str, "av_idv", str2, str3);
            Pxi.A1C(A0e, r3.getModuleName());
        }
    }

    public static final void A03(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, String str4) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "av_back_button_tapped");
        if (A0e.isSampled()) {
            if (str == null) {
                str = "";
            }
            A01(A0e, str, str2, str3, str4);
            Pxi.A1C(A0e, r2.getModuleName());
        }
    }

    public static final void A04(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, String str4) {
        String str5;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "av_cancel_tapped");
        if (A0e.isSampled()) {
            if (str == null) {
                str = "";
            }
            A01(A0e, str, str2, str3, str4);
            if (r2 != null) {
                str5 = r2.getModuleName();
            } else {
                str5 = null;
            }
            Pxi.A1C(A0e, str5);
        }
    }

    public static final void A05(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, String str4) {
        String str5;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "av_submit_tapped");
        if (A0e.isSampled()) {
            if (str == null) {
                str = "";
            }
            A01(A0e, str, str2, str3, str4);
            if (r2 != null) {
                str5 = r2.getModuleName();
            } else {
                str5 = null;
            }
            Pxi.A1C(A0e, str5);
        }
    }
}
