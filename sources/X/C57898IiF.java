package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IiF  reason: case insensitive filesystem */
public final class C57898IiF implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ 2Wa A01;
    public final /* synthetic */ GOK A02;

    public C57898IiF(Handler handler, 2Wa r2, GOK gok) {
        this.A01 = r2;
        this.A00 = handler;
        this.A02 = gok;
    }

    public final void run() {
        2Wa r0 = this.A01;
        r0.A00();
        Handler handler = this.A00;
        C57720IfN ifN = new C57720IfN(r0);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        UserSession userSession = this.A02.A04;
        handler.postDelayed(ifN, timeUnit.toMillis(182.A01(AnonymousClass7TF.A0H(userSession), userSession, 36604636170490954L)));
    }
}
