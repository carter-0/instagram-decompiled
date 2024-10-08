package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3is  reason: invalid class name and case insensitive filesystem */
public final class C248963is extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248963is(2Lk r7) {
        super("ClipsFlashCacheWarmup", 1452655717, 3, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.9FX, java.lang.Object] */
    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        AnonymousClass9FT r4 = new AnonymousClass9FT(context, userSession);
        UserSession userSession2 = r4.A01;
        AnonymousClass93C r3 = AnonymousClass93C.A04;
        AnonymousClass93D.A00(userSession2, r3).B5y(new Object(), new AnonymousClass9FU(r4), r3);
    }
}
