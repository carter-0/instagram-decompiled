package X;

import android.os.Process;

/* renamed from: X.PUm  reason: case insensitive filesystem */
public final class C73055PUm implements Runnable {
    public final /* synthetic */ MY0 A00;

    public C73055PUm(MY0 my0) {
        this.A00 = my0;
    }

    public final void run() {
        MY0 my0 = this.A00;
        Process.setThreadPriority(my0.A01);
        my0.A00 = false;
    }
}
