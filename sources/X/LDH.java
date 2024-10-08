package X;

import com.instagram.common.session.UserSession;

public final class LDH {
    public long A00;
    public final 0xa A01;
    public final boolean A02;

    public LDH(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = 182.A06(0Tu.A05, userSession, 36327748218075813L);
        this.A01 = C51969G9p.A0n(1Al.A01(userSession), 1An.A2A, this);
    }

    public final void A00(long j) {
        if (this.A02) {
            0xY AR4 = this.A01.AR4();
            AR4.E5c("last_play_pile_animation_time", j);
            AR4.apply();
            return;
        }
        this.A00 = j;
    }
}
