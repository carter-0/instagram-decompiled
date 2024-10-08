package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hR  reason: invalid class name and case insensitive filesystem */
public final class C248113hR extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248113hR(2Lk r7) {
        super("initCCUPlugin", 362, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        if (C267044ar.A01(context, userSession)) {
            AnonymousClass94I r0 = AnonymousClass94I.A01;
            if (r0 == null) {
                r0 = new AnonymousClass94I();
                AnonymousClass94I.A01 = r0;
            }
            r0.A00(context, userSession);
        }
    }
}
