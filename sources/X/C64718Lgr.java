package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lgr  reason: case insensitive filesystem */
public final class C64718Lgr implements C61110lV {
    public final /* synthetic */ 2Lk A00;

    public C64718Lgr(2Lk r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1150239612);
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        ((C19250WRj) userSession.A01(C19250WRj.class, new MMJ(userSession, 21))).onAppBackgrounded();
        AnonymousClass0fD.A0A(1149098529, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-1847731243);
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        ((C19250WRj) userSession.A01(C19250WRj.class, new MMJ(userSession, 21))).onAppForegrounded();
        AnonymousClass0fD.A0A(-1218518082, A03);
    }
}
