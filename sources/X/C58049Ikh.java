package X;

import android.os.Handler;
import java.util.TimerTask;

/* renamed from: X.Ikh  reason: case insensitive filesystem */
public final class C58049Ikh extends TimerTask {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Runnable A01;

    public C58049Ikh(Handler handler, Runnable runnable) {
        this.A00 = handler;
        this.A01 = runnable;
    }

    public final void run() {
        this.A00.post(this.A01);
    }
}
