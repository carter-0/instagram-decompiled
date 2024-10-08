package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.MiC  reason: case insensitive filesystem */
public final class C67092MiC implements Runnable {
    public final /* synthetic */ C67017Mgq A00;

    public C67092MiC(C67017Mgq mgq) {
        this.A00 = mgq;
    }

    public final void run() {
        this.A00.A0A(AwakeTimeSinceBootClock.INSTANCE.now(), 113);
    }
}
