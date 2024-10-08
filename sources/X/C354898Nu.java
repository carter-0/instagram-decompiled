package X;

import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Nu  reason: invalid class name and case insensitive filesystem */
public final class C354898Nu extends 2YL {
    public CountDownTimer A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final 05G A03;
    public final 05G A04;
    public final UserSession A05;

    public C354898Nu(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        02z r0 = new 02z(false);
        this.A03 = r0;
        19B r2 = 19B.A00;
        this.A01 = C226292g8.A00(r2, r0);
        02z r02 = new 02z(0);
        this.A04 = r02;
        this.A02 = C226292g8.A00(r2, r02);
    }

    public final void A00() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A03.Epw(false);
        this.A04.Epw(0);
    }
}
