package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hQ  reason: invalid class name and case insensitive filesystem */
public final class C248103hQ extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248103hQ(2Lk r7) {
        super("ensureFreshBootstrap", 361, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        C3728292s A002 = C3728192r.A00(userSession);
        synchronized (A002) {
            if (((Boolean) A002.A03.getValue()).booleanValue()) {
                AnonymousClass0eM r12 = A002.A04;
                if (!((C363368jb) r12.getValue()).A02) {
                    ((C363368jb) r12.getValue()).A03();
                }
            }
        }
        C363288jT.A00(userSession).A05();
        if (!182.A06(0Tu.A05, userSession, 36331033867731836L)) {
            C293655l8.A00(userSession).A02();
        }
    }
}
