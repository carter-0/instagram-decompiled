package X;

import android.os.PowerManager;
import java.util.EnumSet;

/* renamed from: X.4M9  reason: invalid class name */
public final class AnonymousClass4M9 implements Runnable {
    public final /* synthetic */ AnonymousClass4M1 A00;

    public AnonymousClass4M9(AnonymousClass4M1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass4M1 r1 = this.A00;
        EnumSet enumSet = AnonymousClass4M1.A1M;
        PowerManager.WakeLock wakeLock = r1.A0C;
        if (wakeLock != null && !wakeLock.isHeld()) {
            double d = r1.A00;
            if (d > 0.0d) {
                long j = (long) (d * 1000.0d);
                wakeLock.acquire(j);
                0BX.A01(wakeLock, j);
                return;
            }
            C60270fk.A00(wakeLock);
        }
    }
}
