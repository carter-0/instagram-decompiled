package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IhI  reason: case insensitive filesystem */
public final class C57839IhI implements Runnable {
    public final /* synthetic */ C263744Ne A00;
    public final /* synthetic */ C232722uK A01;

    public C57839IhI(C263744Ne r1, C232722uK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C263744Ne r3 = this.A00;
        1Xj r2 = (1Xj) r3.A03;
        UserSession userSession = this.A01.A0K;
        AnonymousClass4DU r0 = r3.A0E;
        AnonymousClass3WP.A02(userSession, r2, r0);
        C52086GEg.A0X(r0, userSession, r2);
    }
}
