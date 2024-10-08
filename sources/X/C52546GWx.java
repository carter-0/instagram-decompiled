package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.GWx  reason: case insensitive filesystem */
public final class C52546GWx implements JPT {
    public long A00;
    public boolean A01;
    public final /* synthetic */ AnonymousClass32L A02;

    public final void DC4(Integer num) {
        0qQ.A0B(num, 0);
        boolean z = false;
        if (this.A01) {
            this.A01 = false;
        } else {
            if (num == AnonymousClass05K.A0C) {
                z = true;
            }
            this.A01 = z;
            long j = this.A00;
            if (j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > j) {
                    A00(currentTimeMillis - j, num);
                }
            } else if (num == AnonymousClass05K.A00) {
                A00(0, num);
                return;
            } else {
                return;
            }
        }
        this.A00 = 0;
    }

    public C52546GWx(AnonymousClass32L r1) {
        this.A02 = r1;
    }

    private final void A00(long j, Integer num) {
        String str;
        String str2;
        AnonymousClass32L r2 = this.A02;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r2.getSession()), "instagram_explore_tail_load");
        if (A0e.isSampled()) {
            Long A0S = C51974G9v.A0S(A0e, r2.getModuleName(), j);
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
            GT0 gt0 = r2.A0E;
            Long l = null;
            if (!(gt0 == null || (str2 = gt0.A05) == null || str2.length() == 0)) {
                l = DbV.A0q(str2);
            }
            A0e.A9F("client_page", l);
            A0e.A9F("client_position", A0S);
            A0e.Cgf();
        }
    }

    public final void onStart() {
        if (this.A00 == 0) {
            this.A00 = System.currentTimeMillis();
        }
        this.A01 = false;
    }
}
