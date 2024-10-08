package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class T7E implements C61110lV, 0lm {
    public C10742RxL A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void onUserSessionWillEnd(boolean z) {
        C10742RxL rxL = this.A00;
        if (rxL != null) {
            rxL.A04.execute(new C12965TFy(rxL, new Object()));
        }
        this.A00 = null;
        this.A01 = false;
        14i.A06(this);
    }

    public T7E(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A02 = context;
        this.A03 = userSession;
    }

    public final void onAppBackgrounded() {
        int i;
        int A032 = AnonymousClass0fD.A03(-1729699);
        if (this.A01) {
            i = -1239821071;
        } else {
            this.A01 = true;
            Pxi.A1J(this, 19E.A02(AnonymousClass12T.A00.CO6(2039365775, 3)), 32);
            i = -1074342071;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1396815770, AnonymousClass0fD.A03(-438707037));
    }
}
