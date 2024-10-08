package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2m4  reason: invalid class name and case insensitive filesystem */
public final class C228662m4 extends AnonymousClass2m1 {
    public boolean A00;
    public final C228602lw A01;
    public final UserSession A02;

    public final void Des(AnonymousClass1GU r12, 1XM r13) {
        if (!this.A00) {
            this.A00 = true;
            long currentTimeMillis = System.currentTimeMillis();
            UserSession userSession = this.A02;
            1se A002 = 1sd.A00(userSession);
            0xa r8 = A002.A00;
            if (currentTimeMillis < r8.getLong("lastSyncMediaIdsTime", 0) || currentTimeMillis > r8.getLong("lastSyncMediaIdsTime", 0) + 43200000) {
                C228602lw r3 = this.A01;
                1NY r2 = new 1NY(userSession);
                r2.A08(AnonymousClass05K.A0N);
                r2.A0A("media/blocked/");
                r2.A0R(C277154ua.class, C277164ub.class);
                1OC A0M = r2.A0M();
                A0M.A00 = new C277174uc(A002);
                r3.schedule(A0M);
            }
        }
    }

    public C228662m4(Context context, AnonymousClass07i r4, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = new C228602lw(context, r4, (Integer) null);
    }
}
