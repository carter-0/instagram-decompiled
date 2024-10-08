package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fv5  reason: case insensitive filesystem */
public final class C51497Fv5 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C247383gF A02;
    public final /* synthetic */ C47028DpK A03;

    public C51497Fv5(Context context, UserSession userSession, C247383gF r3, C47028DpK dpK) {
        this.A00 = context;
        this.A02 = r3;
        this.A03 = dpK;
        this.A01 = userSession;
    }

    public final void run() {
        Context context = this.A00;
        0qQ.A0A(context);
        Activity A012 = C61270mF.A01(context);
        if (A012 != null) {
            C247383gF r0 = this.A02;
            C47028DpK dpK = this.A03;
            UserSession userSession = this.A01;
            r0.A02();
            AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(A012, 2131956637);
            A0e.A03(dpK.A08);
            A0e.A02();
            A0e.A0B = true;
            A0e.A0A = true;
            A0e.A00().A07(userSession);
        }
    }
}
