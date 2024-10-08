package X;

import com.instagram.common.session.UserSession;

public final class IPG implements C250603lj {
    public final 0wc A00;
    public final UserSession A01;
    public final String A02;

    public IPG(UserSession userSession, String str, String str2) {
        this.A01 = userSession;
        this.A02 = str2;
        this.A00 = DbW.A0J(userSession, str);
    }

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        String str;
        AnonymousClass7TG.A1N(r8, r9);
        String str2 = ((C270464gm) r8.A03).A06;
        0qQ.A07(str2);
        Integer CEk = r9.CEk(r8);
        Integer num = AnonymousClass05K.A00;
        if (CEk == num) {
            if (str2.equals("alternative_topic_nudge")) {
                UserSession userSession = this.A01;
                1Av A002 = 1Au.A00(userSession);
                long currentTimeMillis = System.currentTimeMillis();
                0xY A0p = AnonymousClass7TE.A0p(A002);
                A0p.E5c("alternate_topic_nudge_last_seen_time", currentTimeMillis);
                A0p.apply();
                I3D.A02(userSession, num, AnonymousClass7TG.A0I());
            }
            if (str2.equals("take_a_break_nudge")) {
                1Au.A00(this.A01).A0l(AnonymousClass7TG.A0I());
            }
        } else if (r9.CEk(r8) == AnonymousClass05K.A0C) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A00, "discover_media_chaining_alt_topic_nudge");
            DbS.A1J(A0e, "vpvd_impression");
            if (str2.equals("take_a_break_nudge")) {
                num = AnonymousClass05K.A01;
            } else if (!str2.equals("alternative_topic_nudge")) {
                str = "Unknown";
                A0e.AAJ("nudge_name", str);
                C51965G9l.A1R(A0e, this.A02);
                A0e.A8D("dwell_time", Double.valueOf(((double) r9.B0M(r8)) / 1000.0d));
                A0e.Cgf();
            }
            str = C55178HdU.A00(num);
            A0e.AAJ("nudge_name", str);
            C51965G9l.A1R(A0e, this.A02);
            A0e.A8D("dwell_time", Double.valueOf(((double) r9.B0M(r8)) / 1000.0d));
            A0e.Cgf();
        }
    }
}
