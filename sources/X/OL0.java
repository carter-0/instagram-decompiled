package X;

import android.os.SystemClock;
import com.facebook.quicklog.EventBuilder;
import com.instagram.common.session.UserSession;

public final class OL0 {
    public final 02m A00 = C51965G9l.A0l();
    public final 0wc A01;
    public final String A02;

    public OL0(UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 1);
        this.A01 = C66580MXl.A0N(new AnonymousClass0kM(userSession), "ig_fos_headers");
        19i A012 = 0jh.A04.A01(userSession).A01(19f.A1C);
        if (A012 != null) {
            str = A012.A01;
        } else {
            str = null;
        }
        this.A02 = str;
    }

    public final void A00(String str, Integer num, String str2) {
        02m r1 = this.A00;
        String A002 = C70358O3k.A00(num);
        EventBuilder annotate = r1.markEventBuilder(1048055047, A002).annotate("event", A002);
        String A003 = AnonymousClass000.A00(3136);
        annotate.annotate(A003, str).annotate("extra", str2).report();
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "ig_fos_headers_client_logs");
        if (A0e.isSampled()) {
            A0e.AAJ("event", A002);
            A0e.AAJ("extra", str2);
            A0e.AAJ(A003, str);
            String str3 = this.A02;
            if (str3 == null) {
                str3 = "";
            }
            A0e.AAJ(AnonymousClass9NE.A01(0, 9, 119), str3);
            A0e.A9F("client_timestamp", new Long(SystemClock.elapsedRealtime()));
            A0e.Cgf();
        }
    }
}
