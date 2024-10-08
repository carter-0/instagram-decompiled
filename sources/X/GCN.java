package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

public final class GCN implements C250603lj {
    public Runnable A00;
    public final C270694h9 A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final UserSession A03;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        Runnable runnable;
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r8);
        int A0A = C51968G9o.A0A(r7, r8);
        if (A0A == 0) {
            UserSession userSession = this.A03;
            0Tu r2 = 0Tu.A06;
            if (182.A06(r2, userSession, 36319239891852362L)) {
                C57873Ihq ihq = new C57873Ihq(r7, this);
                this.A00 = ihq;
                this.A02.postDelayed(ihq, 182.A01(r2, userSession, 36600714868297696L) * 1000);
            }
        } else if (A0A != A1U && (runnable = this.A00) != null) {
            this.A02.removeCallbacks(runnable);
        }
    }

    public GCN(C270694h9 r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A03 = userSession;
        this.A01 = r2;
    }
}
