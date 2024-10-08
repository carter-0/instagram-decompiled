package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.HashMap;

public abstract class LPX {
    public static final void A02(UserSession userSession, MSL msl, String str, String str2, int i) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        String str3 = str;
        if (str != null) {
            1OC A06 = DirectThreadApi.A06(userSession2, str, (String) null);
            A06.A00 = new C61297K1k(userSession2, msl, str3, str2, str, i);
            1ES.A03(A06);
        }
    }

    public static final void A01(C268654dm r3, UserSession userSession, String str, String str2, int i) {
        1Ln A0J;
        String str3;
        String str4;
        if (r3 != null) {
            AnonymousClass1XT r0 = (AnonymousClass1XT) r3.A00();
            C313756gx A00 = C313746gw.A00(userSession);
            String str5 = null;
            if (r0 != null) {
                str3 = r0.getErrorType();
                str4 = r0.getErrorTitle();
                str5 = r0.getErrorBody();
            } else {
                str3 = null;
                str4 = null;
            }
            A0J = DbT.A0J(A00);
            if (DbT.A1Y(A0J)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("error_type", str3);
                A1E.put(AnonymousClass000.A00(284), str4);
                A1E.put(AnonymousClass000.A00(3066), str5);
                DbW.A17(A0J, A00);
                Dba.A1D(A0J, "thread_join_error");
                A0J.A0p("join_broadcast_chat");
                DbZ.A1L(A0J, "broadcast_chat_preview", i);
                A0J.A0s((String) null);
                A0J.A0i((Long) null);
                A0J.A0w(A1E);
            } else {
                return;
            }
        } else {
            C313756gx A002 = C313746gw.A00(userSession);
            A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A002);
                Dba.A1D(A0J, "thread_join_successful");
                A0J.A0p("join_broadcast_chat");
                A0J.A0i(DbZ.A0b(A0J, "thread_view", str, str2, i));
            } else {
                return;
            }
        }
        A0J.Cgf();
    }

    public static final AnonymousClass0r6 A00(UserSession userSession, String str, String str2, String str3, int i) {
        return JUM.A03(new MGN(userSession, str, str2, (AnonymousClass4D7) null, i), JUM.A04(new MFe(userSession, str, str2, (AnonymousClass4D7) null, i), JUM.A01(new C66181MGs(11, (AnonymousClass4D7) null), DirectThreadApi.A06(userSession, str, str3).A03(1495037516))));
    }
}
