package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3iB  reason: invalid class name and case insensitive filesystem */
public final class C248553iB extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248553iB(2Lk r7) {
        super("supInitializeConnection", 635062881, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        boolean A01 = C362988ir.A01(context.getApplicationContext(), userSession);
        C363068j2 r2 = C363058j1.A02;
        String A1D = 002.A1D("Start voltron download: ", A01);
        String A002 = AnonymousClass000.A00(4075);
        r2.A01(A002, A1D);
        if (A01) {
            C17806VgJ A003 = 1pd.A00(C362988ir.A00());
            Context applicationContext = context.getApplicationContext();
            0qQ.A07(applicationContext);
            A003.A00(applicationContext, userSession, C40624Afm.A00, A002);
        }
    }
}
