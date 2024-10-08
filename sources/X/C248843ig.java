package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ig  reason: invalid class name and case insensitive filesystem */
public final class C248843ig extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248843ig(2Lk r7, int i) {
        super("fetchAvatarStatus", 723534057, i, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        25x.A00(userSession).A05(AnonymousClass9EZ.A00, userSession);
    }
}
