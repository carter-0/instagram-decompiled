package X;

import com.instagram.common.session.UserSession;

public final class LT0 {
    public static final LT0 A00 = new Object();

    public static final void A01(AnonymousClass0iw r10, UserSession userSession, String str, String str2, String str3, Throwable th, int i) {
        String str4;
        String str5;
        String str6 = str2;
        0qQ.A0B(str2, 3);
        String str7 = "";
        if (th != null) {
            str4 = th.getLocalizedMessage();
            StackTraceElement[] stackTrace = th.getStackTrace();
            0qQ.A07(stackTrace);
            if (stackTrace.length != 0) {
                str7 = th.getStackTrace()[0].getClassName();
                StringBuilder A1A = AnonymousClass7TE.A1A();
                0sC A002 = 0pe.A00(th.getStackTrace());
                while (A002.hasNext()) {
                    A1A.append(A002.next().toString());
                    A1A.append("\n");
                }
                str5 = A1A.toString();
                AnonymousClass7TF.A1F(str7, 7, str5);
                0xI A003 = A00(r10, userSession, Integer.valueOf(i), str, str6, str3);
                A003.A0C("event", 002.A0R("fb_ig_client_failure_", str3));
                A003.A0C("exception_message", str4);
                A003.A0C("exception_class", str7);
                A003.A0C("exception_stack", str5);
                DbU.A1R(A003, userSession);
            }
        } else {
            str4 = str7;
        }
        str5 = str7;
        AnonymousClass7TF.A1F(str7, 7, str5);
        0xI A0032 = A00(r10, userSession, Integer.valueOf(i), str, str6, str3);
        A0032.A0C("event", 002.A0R("fb_ig_client_failure_", str3));
        A0032.A0C("exception_message", str4);
        A0032.A0C("exception_class", str7);
        A0032.A0C("exception_stack", str5);
        DbU.A1R(A0032, userSession);
    }

    public static final void A02(UserSession userSession, AnonymousClass0iw r8, String str, String str2, String str3, int i) {
        0qQ.A0B(str2, 3);
        UserSession userSession2 = userSession;
        AnonymousClass0iw r2 = r8;
        0xI A002 = A00(r2, userSession2, Integer.valueOf(i), str, str2, str3);
        A002.A0C("event", 002.A0R("fb_ig_client_request_", str3));
        DbU.A1R(A002, userSession2);
    }

    public static final void A03(UserSession userSession, AnonymousClass0iw r8, String str, String str2, String str3, int i) {
        0qQ.A0B(str2, 3);
        UserSession userSession2 = userSession;
        AnonymousClass0iw r2 = r8;
        0xI A002 = A00(r2, userSession2, Integer.valueOf(i), str, str2, str3);
        A002.A0C("event", 002.A0R("fb_ig_client_success_", str3));
        DbU.A1R(A002, userSession2);
    }

    public static final 0xI A00(AnonymousClass0iw r2, UserSession userSession, Integer num, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        0xI A002 = 0xI.A00(r2, "ig_fb_xposting_waterfall");
        if (str3.equalsIgnoreCase("share_later")) {
            str4 = "TIMELINE";
        } else {
            str4 = "FB_STORY";
        }
        A002.A0C("share_to_surface", str4);
        if (DbT.A0j(userSession).CPm()) {
            str5 = "BUSINESS";
        } else {
            str5 = "PERSONAL";
        }
        A002.A0C("ig_account_type", str5);
        if (AnonymousClass8PU.A06(userSession)) {
            str6 = "PAGE";
        } else {
            str6 = "USER";
        }
        A002.A0C("share_to_entity_type", str6);
        A002.A0C("waterfall_id", str);
        A002.A0C("ig_actor_id", userSession.A06);
        A002.A0B(AnonymousClass000.A00(269), C51968G9o.A0u());
        if (num != null) {
            A002.A08(num, "media_type");
        }
        if (str2 != null) {
            A002.A0C("media_id", str2);
        }
        return A002;
    }
}
