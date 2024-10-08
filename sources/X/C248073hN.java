package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hN  reason: invalid class name and case insensitive filesystem */
public final class C248073hN extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248073hN(2Lk r3) {
        super("maybeSyncContactPoints", 359);
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.EHa, X.11X] */
    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 1);
        if (1Au.A00(userSession).A01.getLong(AnonymousClass000.A00(1544), 0) <= System.currentTimeMillis() - 259200000 && context != null) {
            1ES.A03(new C47789EHa(context, userSession));
        }
    }
}
