package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import java.util.Map;

/* renamed from: X.Oax  reason: case insensitive filesystem */
public final class C71078Oax {
    public RtcCallKey A00;
    public String A01;
    public final UserSession A02;
    public final UserFlowLoggerImpl A03 = new UserFlowLoggerImpl(02m.A0p);

    public C71078Oax(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public static 1Ln A00(C71078Oax oax) {
        0wc A022 = AnonymousClass0kN.A02(oax.A02);
        return new 1Ln(A022.A00(A022.A00, "ig_cowatch_event"), 211);
    }

    public static String A01(AnonymousClass0Ac r1, 0Ak r2, C71078Oax oax) {
        r2.A0M(r1, "source");
        RtcCallKey rtcCallKey = oax.A00;
        if (rtcCallKey != null) {
            return rtcCallKey.A00;
        }
        return null;
    }

    public static void A02(AnonymousClass0Ac r2, AnonymousClass0Ac r3, 0Ak r4, C71078Oax oax, String str) {
        r4.A0R("waterfall_id", oax.A01);
        r4.A0M(r2, "media_source");
        r4.A0M(r3, "media_type");
        r4.A0R("media_id", str);
        r4.Cgf();
    }

    public final void A03(C69502Nmk nmk, String str, Map map) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A02), "ig_cowatch_event");
        if (A0e.isSampled()) {
            C51965G9l.A19(nmk, A0e);
            RtcCallKey rtcCallKey = this.A00;
            if (rtcCallKey != null) {
                str2 = rtcCallKey.A00;
            } else {
                str2 = null;
            }
            A0e.AAJ("server_info", str2);
            A0e.AAJ("waterfall_id", this.A01);
            A0e.A9H("extra_info", map);
            A0e.AAJ("media_id", str);
            A0e.Cgf();
        }
    }
}
