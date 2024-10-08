package X;

import android.os.Handler;

/* renamed from: X.Maj  reason: case insensitive filesystem */
public final class C66676Maj implements Runnable, C65051aA {
    public final Handler A00;
    public final Runnable A01;

    public final void dispose() {
        this.A00.removeCallbacks(this);
    }

    public final void run() {
        try {
            this.A01.run();
        } catch (Throwable th) {
            C318176oW.A01(th);
        }
    }

    public C66676Maj(Handler handler, Runnable runnable) {
        this.A00 = handler;
        this.A01 = runnable;
    }
}
