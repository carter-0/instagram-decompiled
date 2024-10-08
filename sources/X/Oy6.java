package X;

import com.instagram.common.session.UserSession;

public final class Oy6 implements AnonymousClass0lh {
    public final UserSession A00;
    public final boolean A01;

    public final void A00(int i, int i2, int i3, long j) {
        String str;
        long j2;
        long j3;
        if (this.A01 && i == 0) {
            C72208OyY A002 = C72208OyY.A00(this.A00);
            0qQ.A07(A002);
            OO3 oo3 = A002.A01;
            if (oo3 != null && (str = oo3.A07) != null) {
                0Aj A0e = AnonymousClass7TE.A0e(oo3.A0E, "igd_search_latency");
                if (A0e.isSampled()) {
                    AnonymousClass7TE.A1W(A0e, "search_surface", 0);
                    if (0mp.A0B(oo3.A06)) {
                        j2 = System.currentTimeMillis();
                    } else {
                        j2 = oo3.A00;
                    }
                    A0e.A9F(AnonymousClass000.A00(5280), Long.valueOf(j2));
                    A0e.A9F("end_time_ms", C51968G9o.A0u());
                    AnonymousClass7TE.A1W(A0e, "data_source", i2);
                    A0e.A9F("result_count", Long.valueOf(j));
                    AnonymousClass7TE.A1W(A0e, "load_status", i3);
                    A0e.AAJ("query_string", (String) null);
                    A0e.AAJ("search_session_id", str);
                    String str2 = oo3.A06;
                    if (str2 != null) {
                        j3 = (long) str2.length();
                    } else {
                        j3 = 0;
                    }
                    A0e.A9F("query_string_length", Long.valueOf(j3));
                    A0e.Cgf();
                }
            }
        }
    }

    public final void onSessionWillEnd() {
    }

    public Oy6(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = 182.A06(0Tu.A06, userSession, 36313931307813183L);
    }
}
