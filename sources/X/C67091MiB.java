package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.MiB  reason: case insensitive filesystem */
public final class C67091MiB implements Runnable {
    public final /* synthetic */ Mi9 A00;

    public C67091MiB(Mi9 mi9) {
        this.A00 = mi9;
    }

    public final void run() {
        this.A00.A0A(AwakeTimeSinceBootClock.INSTANCE.now(), 113);
    }
}
