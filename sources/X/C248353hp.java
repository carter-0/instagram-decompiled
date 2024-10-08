package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hp  reason: invalid class name and case insensitive filesystem */
public final class C248353hp extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248353hp(2Lk r7) {
        super("maybeFetchAccountLinkingInfo", 380, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r2 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        long j = AnonymousClass1B0.A02;
        UserSession userSession = r2.A04;
        boolean A002 = AnonymousClass1B1.A00(userSession).A00(1B2.A03);
        0Tu r22 = 0Tu.A05;
        if (182.A06(r22, userSession, 36328151944543194L)) {
            return;
        }
        if (!182.A06(r22, userSession, 36328151944608731L) || !A002) {
            AnonymousClass9BE.A00(userSession).A02();
        }
    }
}
