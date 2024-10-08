package X;

import android.app.PendingIntent;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ff7  reason: case insensitive filesystem */
public final class C50593Ff7 implements G60 {
    public final /* synthetic */ AnonymousClass9EU A00;

    public final void D54(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass9EU r3 = this.A00;
        UserSession userSession = r3.A03;
        0qQ.A0B(userSession, 0);
        String A002 = AnonymousClass000.A00(1041);
        DbX.A1U(((C49359EuN) userSession.A01(C49359EuN.class, new C51797G2g(userSession, 42))).A00, A002, str);
        PendingIntent A003 = AnonymousClass9EU.A00(r3);
        if (A003 != null) {
            r3.A01.set(2, SystemClock.elapsedRealtime() + 86400000, A003);
        }
    }

    public C50593Ff7(AnonymousClass9EU r1) {
        this.A00 = r1;
    }
}
