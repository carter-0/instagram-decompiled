package X;

import android.os.PowerManager;
import java.util.EnumSet;

/* renamed from: X.4M8  reason: invalid class name */
public final class AnonymousClass4M8 implements Runnable {
    public final /* synthetic */ AnonymousClass4M1 A00;

    public AnonymousClass4M8(AnonymousClass4M1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass4M1 r1 = this.A00;
        EnumSet enumSet = AnonymousClass4M1.A1M;
        PowerManager.WakeLock wakeLock = r1.A0C;
        if (wakeLock != null && wakeLock.isHeld()) {
            C60270fk.A01(wakeLock);
        }
    }
}
