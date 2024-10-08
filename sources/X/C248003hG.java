package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hG  reason: invalid class name and case insensitive filesystem */
public final class C248003hG extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248003hG(2Lk r7) {
        super("prefetchNewsfeed", 353, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        if (!182.A06(0Tu.A05, userSession, 36328151947820035L)) {
            AnonymousClass4HO.A00(userSession, new AnonymousClass4HN(userSession)).A03(false);
        }
    }
}
