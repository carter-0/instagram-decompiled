package X;

import android.os.Handler;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4pj  reason: invalid class name and case insensitive filesystem */
public final class C275184pj extends C275194pk implements C275204pl, C275104pb {
    public long A00;
    public final Handler A01;
    public final Runnable A02 = new C275214pm(this);
    public final ConcurrentLinkedQueue A03 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final long A05;
    public final Runnable A06 = new C275224pn(this);

    public final void ASk(boolean z) {
        long j;
        if (z) {
            j = this.A05;
        } else {
            j = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        }
        this.A00 = j;
        Handler handler = this.A01;
        Runnable runnable = this.A02;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.A00);
    }

    public final void E4R(C274844pB r3) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A03;
        concurrentLinkedQueue.add(r3);
        if (concurrentLinkedQueue.size() >= 256) {
            AtomicBoolean atomicBoolean = this.A04;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                this.A01.post(this.A06);
            }
        }
    }

    public final void start() {
        this.A01.postDelayed(this.A02, this.A00);
    }

    public C275184pj(C275074pY[] r3, long j) {
        super(r3);
        this.A05 = j;
        this.A01 = new Handler(C262444Ef.A00().A01.getLooper());
        this.A00 = !C274794p6.A02.A01.get() ? StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS : j;
        C274794p6.A02.A00(this);
    }
}
