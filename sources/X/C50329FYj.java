package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FYj  reason: case insensitive filesystem */
public final class C50329FYj implements AnonymousClass0lh {
    public long A00;
    public long A01;
    public long A02;
    public final boolean A03;
    public final UserSession A04;

    public final void A00(AnonymousClass0iw r12, Boolean bool, Boolean bool2, String str, long j, boolean z) {
        Long l;
        if (this.A03) {
            long j2 = this.A02;
            if (j2 != 0) {
                long j3 = this.A01;
                Long l2 = null;
                if (j3 != 0) {
                    l = Long.valueOf(j3 - j2);
                } else {
                    l = null;
                }
                if (j3 != 0) {
                    long j4 = this.A00;
                    if (j4 != 0) {
                        l2 = Long.valueOf(j4 - j3);
                    }
                }
                UserSession userSession = this.A04;
                long j5 = j - j2;
                0Tu r5 = 0Tu.A05;
                Long A0Y = AnonymousClass7TF.A0Y(r5, userSession, 36594929543284713L);
                Boolean A0R = AnonymousClass7TF.A0R(r5, userSession, 36313454566508550L);
                0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(r12, userSession), "banyan_real_time_latency");
                A0e.A9F("max_ranking_timeout", A0Y);
                A0e.A7p("is_real_time_ranking_request", A0R);
                A0e.A7p("is_private_reshare", bool);
                A0e.A7p("api_surpassed_timeout", bool2);
                if (str == null) {
                    str = "";
                }
                A0e.AAJ("ranking_request_id", str);
                A0e.A9F("time_latency_ms", Long.valueOf(j5));
                A0e.A7p("load_status", Boolean.valueOf(z));
                A0e.A9F("network_latency_ms", l2);
                A0e.A9F("preprocessing_latency_ms", l);
                A0e.Cgf();
                this.A02 = 0;
            }
        }
    }

    public final void onSessionWillEnd() {
        this.A02 = 0;
    }

    public C50329FYj(UserSession userSession) {
        this.A04 = userSession;
        this.A03 = 182.A06(0Tu.A06, userSession, 36313454566443013L);
    }
}
