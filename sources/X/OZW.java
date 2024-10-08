package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.TimeZone;

public final class OZW {
    public static final OZW A00 = new Object();

    public static final HashMap A00(String str, String str2, String str3, String str4) {
        String id;
        0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(1258), str);
        0eP A1L2 = AnonymousClass7TE.A1L("merchant_id", str2);
        String str5 = "";
        if (str3 == null) {
            str3 = str5;
        }
        0eP A1L3 = AnonymousClass7TE.A1L("appointment_id", str3);
        TimeZone timeZone = TimeZone.getDefault();
        if (!(timeZone == null || (id = timeZone.getID()) == null)) {
            str5 = id;
        }
        return 0Yt.A02(new 0eP[]{A1L, A1L2, A1L3, AnonymousClass7TE.A1L("timezone", str5), AnonymousClass7TE.A1L("referrer_ui_component", str4)});
    }

    public final void A01(FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        boolean A1Y = DbW.A1Y(r6);
        C331127Pr A0e = DbX.A0e(userSession, A1Y);
        A0e.A0x = A1Y;
        A0e.A1G = A1Y;
        A0e.A03 = 0.7f;
        C46649DiU A04 = C46649DiU.A04(str, A00(str2, str3, str4, str5));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0R = r6.getModuleName();
        A0N.A00 = 32;
        A0N.A0P = AnonymousClass05K.A01;
        C46622Di2 A01 = C49891FBs.A01(A0N, A04);
        A0e.A0T = A01;
        DbU.A0y(fragmentActivity, A01, A0e);
    }

    public final void A02(FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        DbY.A1S(fragmentActivity, r6);
        C46649DiU A04 = C46649DiU.A04(str, A00(str2, str3, str4, str5));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        Integer num = AnonymousClass05K.A01;
        A0N.A0P = num;
        A0N.A0R = r6.getModuleName();
        A0N.A00 = 32;
        A0N.A0P = num;
        A0N.A0S = str6;
        A04.A0D(fragmentActivity, A0N);
    }
}
