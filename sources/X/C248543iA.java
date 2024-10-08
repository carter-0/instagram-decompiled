package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3iA  reason: invalid class name and case insensitive filesystem */
public final class C248543iA extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248543iA(2Lk r7) {
        super("fetchSessionSurveyEligibility", 708, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r3 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r3.A04;
        if (182.A06(0Tu.A05, userSession, 36311397277106696L)) {
            Context context = r3.A01;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(context, 1);
            AnonymousClass9EF r2 = (AnonymousClass9EF) userSession.A01(AnonymousClass9EF.class, new C20614Wvv(16, context.getApplicationContext(), userSession));
            if (1Au.A00(r2.A05).A01.getInt(AnonymousClass000.A00(325), 0) == 1 && AnonymousClass9EF.A00(r2)) {
                r2.A00 = System.currentTimeMillis();
                AnonymousClass9EG r1 = new AnonymousClass9EG(r2);
                r2.A01 = r1;
                14i.A03(15Y.A03, r1);
            }
        }
    }
}
