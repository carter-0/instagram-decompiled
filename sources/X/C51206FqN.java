package X;

import com.facebook.common.callercontext.CallerContext;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;

/* renamed from: X.FqN  reason: case insensitive filesystem */
public final /* synthetic */ class C51206FqN implements Runnable {
    public final /* synthetic */ UserSession A00;

    public /* synthetic */ C51206FqN(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1xE, java.lang.Object] */
    public final void run() {
        UserSession userSession = this.A00;
        CallerContext callerContext = C46399DeM.A00;
        0xa A03 = 1Al.A01(userSession).A03(1An.A1U);
        String A0B = new Gson().A0B(new C262474Ej(AnonymousClass3H5.A01.A02(userSession, false), System.currentTimeMillis()));
        0xY AR4 = A03.AR4();
        AR4.E5g("switcher_aggregate_seen_badge_count", A0B);
        AR4.apply();
        2aN.A00(userSession).A04(2aD.A0Z);
        if (AnonymousClass3EM.A04()) {
            1xC.A01.A00(new Object());
        }
    }
}
