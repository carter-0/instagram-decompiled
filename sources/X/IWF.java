package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

public final class IWF implements JPT {
    public int A00;
    public long A01;
    public boolean A02;
    public final UserSession A03;
    public final C52477GUf A04;
    public final String A05;

    public IWF(UserSession userSession, C52477GUf gUf, String str) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = gUf;
    }

    public final void DC4(Integer num) {
        0qQ.A0B(num, 0);
        int i = this.A00;
        boolean z = true;
        if (i > 0 || this.A02) {
            this.A00 = i - 1;
            this.A02 = false;
        } else {
            int i2 = 0;
            if (num == AnonymousClass05K.A0C) {
                i2 = 2;
            }
            this.A00 = i2;
            if (num != AnonymousClass05K.A00) {
                z = false;
            }
            this.A02 = z;
            long j = this.A01;
            if (j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > j) {
                    A00(currentTimeMillis - j, num);
                }
            } else if (z) {
                A00(0, num);
                return;
            } else {
                return;
            }
        }
        this.A01 = 0;
    }

    private final void A00(long j, Integer num) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A03), "instagram_explore_tail_load");
        if (A0e.isSampled()) {
            Long A0S = C51974G9v.A0S(A0e, this.A05, j);
            A0e.A9F("time_spent_all_media_rendered", A0S);
            A0e.A9F("time_spent_first_media_rendered", A0S);
            switch (num.intValue()) {
                case 0:
                    str = RealtimeConstants.SEND_SUCCESS;
                    break;
                case 1:
                    str = "failure";
                    break;
                default:
                    str = "canceled";
                    break;
            }
            A0e.AAJ("event_outcome", str);
            C52477GUf gUf = this.A04;
            A0e.A9F("client_page", DbS.A0j(gUf.A03));
            A0e.A9F("client_position", DbS.A0j(gUf.A04));
            A0e.Cgf();
        }
    }

    public final void onStart() {
        if (this.A01 == 0) {
            this.A01 = System.currentTimeMillis();
        }
        this.A00 = 0;
        this.A02 = false;
    }
}
