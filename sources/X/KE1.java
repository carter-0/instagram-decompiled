package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class KE1 extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C313666go A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C62176KbY kbY;
        UserSession userSession = this.A02;
        C313666go r1 = this.A03;
        C62243Kcd A002 = C63486Kxq.A00(userSession, r1);
        C357498Yd r0 = C357488Yc.A03;
        Context context = this.A00;
        C357488Yc A003 = r0.A00(context, userSession);
        M0X m0x = null;
        if (r1 == C313666go.BROADCASTER) {
            kbY = C64139LPo.A01(this.A01, userSession);
        } else {
            kbY = null;
        }
        C59720JVe A032 = A002.A03();
        LES A022 = A002.A02();
        W0T A004 = A003.A00();
        if (kbY != null) {
            0qQ.A0B(context, 0);
            m0x = kbY.A01(context);
        }
        return new C60216JhZ(27p.A01(userSession), A004, m0x, A022, A032);
    }

    public KE1(Context context, AnonymousClass0iw r2, UserSession userSession, C313666go r4) {
        C51972G9s.A1B(userSession, r4);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = r4;
    }
}
