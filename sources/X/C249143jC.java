package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.zero.dogfooding.IgZeroDogfoodingInit;

/* renamed from: X.3jC  reason: invalid class name and case insensitive filesystem */
public final class C249143jC extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249143jC(2Lk r7) {
        super("ZeroRatingDogfooding", 1940672999, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        userSession.A01(IgZeroDogfoodingInit.class, new C58686Ivv(userSession, 24));
    }
}
