package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hi  reason: invalid class name and case insensitive filesystem */
public final class C248283hi extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248283hi(2Lk r3) {
        super("refreshCloseFriendsCount", 368);
        this.A00 = r3;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        if (!182.A06(0Tu.A05, userSession, 36328151945198560L) && !C2355930l.A02) {
            KA3 ka3 = new KA3();
            if (userSession != null) {
                1OC A002 = C49868FAl.A00(userSession);
                A002.A00 = ka3;
                1ES.A03(A002);
            }
        }
    }
}
