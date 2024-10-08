package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.common.session.UserSession;

/* renamed from: X.3i6  reason: invalid class name and case insensitive filesystem */
public final class C248513i6 extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248513i6(2Lk r7) {
        super("maybePrefetchVideoTabFeed", 678, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r4 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r4.A04;
        if (!182.A06(0Tu.A05, userSession, 36328151947623424L)) {
            C243473Yx.A05.A09(userSession, r4.A01, ClipsPrefetchTriggerType.COLD_START.A00);
        }
    }
}
