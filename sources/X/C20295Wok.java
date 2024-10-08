package X;

import android.os.SystemClock;

/* renamed from: X.Wok  reason: case insensitive filesystem */
public final class C20295Wok implements Runnable {
    public final C46215DQt A00;
    public final Object A01;
    public final /* synthetic */ C19252WRl A02;

    public C20295Wok(C19252WRl wRl, C46215DQt dQt, Object obj) {
        0qQ.A0B(dQt, 2);
        this.A02 = wRl;
        this.A00 = dQt;
        this.A01 = obj;
    }

    public final void run() {
        SystemClock.elapsedRealtime();
        this.A00.DUK(this.A01);
    }
}
