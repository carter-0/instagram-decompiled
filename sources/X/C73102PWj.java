package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.PWj  reason: case insensitive filesystem */
public final class C73102PWj implements Runnable {
    public final /* synthetic */ AnonymousClass65T A00;

    public C73102PWj(AnonymousClass65T r1) {
        this.A00 = r1;
    }

    public final void run() {
        PowerManager powerManager;
        AnonymousClass65T r5 = this.A00;
        r5.A02.invoke(AnonymousClass61K.ARMADILLO_NOTIFICATION_E2E_LOGGING);
        Context context = C60960kU.A00;
        0qQ.A07(context);
        Object systemService = context.getSystemService("power");
        if ((systemService instanceof PowerManager) && (powerManager = (PowerManager) systemService) != null && powerManager.isDeviceIdleMode()) {
            r5.A05.flowAnnotate(r5.A04, "is_idle_mode", true);
        }
        r5.A05.flowEndSuccess(r5.A04);
        r5.A01 = null;
        r5.A03 = false;
        r5.A00 = -1;
    }
}
