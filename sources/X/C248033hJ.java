package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hJ  reason: invalid class name and case insensitive filesystem */
public final class C248033hJ extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248033hJ(2Lk r3) {
        super("maybeLogResurrection", 354);
        this.A00 = r3;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        Context context = r1.A01;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        0xa r6 = 1Au.A00(userSession).A01;
        long j = r6.getLong("last_resurrection_logged_date", 0);
        if (j == 0 || System.currentTimeMillis() - j > 86400000) {
            C16857V8m.A00(context, userSession).A00(EVX.RESURRECTION);
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = r6.AR4();
            AR4.E5c("last_resurrection_logged_date", currentTimeMillis);
            AR4.apply();
        }
    }
}
