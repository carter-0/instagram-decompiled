package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ic  reason: invalid class name and case insensitive filesystem */
public final class C248803ic extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248803ic(2Lk r7) {
        super("setupLocalNotifications", 416812969, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        AnonymousClass9ET r3 = new AnonymousClass9ET(context);
        UserSession userSession = r1.A04;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        AnonymousClass9EU r2 = (AnonymousClass9EU) userSession.A01(AnonymousClass9EU.class, new C58695Iw4(35, (Object) context, (Object) userSession, (Object) r3));
        if (AnonymousClass9EU.A01(r2)) {
            AnonymousClass9EV r12 = new AnonymousClass9EV(r2);
            r2.A00 = r12;
            14i.A03(15Y.A03, r12);
        }
    }
}
