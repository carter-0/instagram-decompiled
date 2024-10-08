package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hV  reason: invalid class name and case insensitive filesystem */
public final class C248153hV extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248153hV(2Lk r7) {
        super("registerHeliumBackgroundDetector", 610639448, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        AnonymousClass94L r3 = AnonymousClass94L.A03;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        AnonymousClass94L.A00 = context;
        AnonymousClass94L.A02 = userSession;
        14i.A03(15Y.A03, r3);
        r3.onAppForegrounded();
    }
}
