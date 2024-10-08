package X;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MYj  reason: case insensitive filesystem */
public final class C66597MYj extends C318286oh {
    public final Handler A00;
    public final boolean A01;
    public volatile boolean A02;

    public final void dispose() {
        this.A02 = true;
        this.A00.removeCallbacksAndMessages(this);
    }

    public final C65051aA A01(Runnable runnable, TimeUnit timeUnit, long j) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            if (!this.A02) {
                Handler handler = this.A00;
                C66676Maj maj = new C66676Maj(handler, runnable);
                Message obtain = Message.obtain(handler, maj);
                obtain.obj = this;
                if (this.A01) {
                    obtain.setAsynchronous(true);
                }
                handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.A02) {
                    return maj;
                }
                handler.removeCallbacks(maj);
            }
            return AnonymousClass6F8.INSTANCE;
        } else {
            throw new NullPointerException(C273654mx.A00(3452));
        }
    }

    public C66597MYj(Handler handler, boolean z) {
        this.A00 = handler;
        this.A01 = z;
    }
}
