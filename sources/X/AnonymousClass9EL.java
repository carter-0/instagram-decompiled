package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9EL  reason: invalid class name */
public final class AnonymousClass9EL implements C363768kJ {
    public final /* synthetic */ 2Lk A00;

    public final void onFailure() {
    }

    public AnonymousClass9EL(2Lk r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1xE, java.lang.Object] */
    public final void onSuccess() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        2aN.A00(userSession).A04(2aD.A0Z);
        1xC.A01.A00(new Object());
        AnonymousClass0eD.A00(userSession);
    }
}
