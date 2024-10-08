package X;

import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.TEr  reason: case insensitive filesystem */
public final class C12940TEr implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SystemForegroundService A01;

    public C12940TEr(SystemForegroundService systemForegroundService, int i) {
        this.A01 = systemForegroundService;
        this.A00 = i;
    }

    public final void run() {
        this.A01.A00.cancel(this.A00);
    }
}
