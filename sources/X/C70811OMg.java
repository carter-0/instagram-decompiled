package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.OMg  reason: case insensitive filesystem */
public final class C70811OMg {
    public Boolean A00;
    public final PowerManager A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C58679Ivo(this, 0));

    public final void A00(int i) {
        Boolean bool = this.A00;
        if (bool == null) {
            boolean z = false;
            try {
                PowerManager powerManager = this.A01;
                if (powerManager.isWakeLockLevelSupported(32)) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("ProximitySensorManager:DetectProximitySensor", new Object[0]);
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(32, formatStrLocaleSafe);
                    0BX.A02(newWakeLock, formatStrLocaleSafe);
                    if (newWakeLock.isHeld()) {
                        C60270fk.A01(newWakeLock);
                    }
                    z = true;
                }
            } catch (Exception unused) {
            }
            bool = Boolean.valueOf(z);
            this.A00 = bool;
        }
        if (AnonymousClass7TF.A1Y(bool, true)) {
            AnonymousClass0eM r1 = this.A02;
            C60270fk.A02((PowerManager.WakeLock) r1.getValue());
            if (((PowerManager.WakeLock) r1.getValue()).isHeld()) {
                return;
            }
            if (i > 0) {
                try {
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) r1.getValue();
                    long j = (long) i;
                    wakeLock.acquire(j);
                    0BX.A01(wakeLock, j);
                } catch (IllegalArgumentException unused2) {
                    this.A00 = false;
                    A01(true);
                }
            } else {
                C60270fk.A00((PowerManager.WakeLock) r1.getValue());
            }
        }
    }

    public final void A01(boolean z) {
        AnonymousClass0eM r1 = this.A02;
        if (r1.CVQ() && ((PowerManager.WakeLock) r1.getValue()).isHeld()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) r1.getValue();
            if (z) {
                C60270fk.A01(wakeLock);
                return;
            }
            wakeLock.release(1);
            0BX.A00(wakeLock);
        }
    }

    public C70811OMg(Context context) {
        Object systemService = context.getSystemService("power");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.A01 = (PowerManager) systemService;
    }
}
