package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3iY  reason: invalid class name and case insensitive filesystem */
public final class C248763iY extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248763iY(2Lk r7, int i, boolean z, boolean z2) {
        super("fetchFxClientCache", 1793449280, i, z, z2);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r2 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r2.A04;
        2Ly A002 = 2Lv.A00(userSession);
        CallerContext callerContext2 = 2Lk.A08;
        A002.A02(callerContext2, new AnonymousClass9EL(r2), "app_start");
        1wM A003 = 1wB.A00(userSession);
        if (1xW.A02(A003.A06)) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36319845478178483L)) {
                A003.A0K(callerContext2, (C363768kJ) null, "app_start", true, false);
            }
        }
    }
}
