package X;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.Q4d  reason: case insensitive filesystem */
public final class C7327Q4d implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Notification A01;
    public final /* synthetic */ SystemForegroundService A02;

    public C7327Q4d(Notification notification, SystemForegroundService systemForegroundService, int i) {
        this.A02 = systemForegroundService;
        this.A00 = i;
        this.A01 = notification;
    }

    public final void run() {
        this.A02.A00.notify(this.A00, this.A01);
    }
}
