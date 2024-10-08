package X;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class TCG implements Runnable {
    public final /* synthetic */ TO9 A00;

    public /* synthetic */ TCG(TO9 to9) {
        this.A00 = to9;
    }

    public final void run() {
        TO9 to9 = this.A00;
        Process.setThreadPriority(-4);
        Looper.prepare();
        Object obj = new Object();
        SystemClock.uptimeMillis();
        SystemClock.currentThreadTimeMillis();
        Pair A0K = Pxe.A0K(Looper.myLooper(), obj);
        CountDownLatch countDownLatch = to9.A02;
        if (countDownLatch.getCount() != 0) {
            to9.A01 = A0K;
            countDownLatch.countDown();
            Looper.loop();
            return;
        }
        throw AnonymousClass7TE.A15("Result has already been set!");
    }
}
