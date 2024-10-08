package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Pxr extends 00q {
    public final Object A00 = Pxe.A0p();
    public final ExecutorService A01 = Executors.newFixedThreadPool(4, new Pxs(this));
    public volatile Handler A02;

    public final void A01(Runnable runnable) {
        this.A01.execute(runnable);
    }

    public final void A02(Runnable runnable) {
        if (this.A02 == null) {
            synchronized (this.A00) {
                if (this.A02 == null) {
                    this.A02 = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        this.A02.post(runnable);
    }

    public final boolean A03() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
