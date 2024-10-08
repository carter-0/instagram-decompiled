package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.4T5  reason: invalid class name */
public final class AnonymousClass4T5 implements AnonymousClass4T6 {
    public PowerManager.WakeLock A00;
    public boolean A01;
    public boolean A02;
    public final PowerManager A03;

    public final void Elw(boolean z) {
        this.A02 = z;
        PowerManager.WakeLock wakeLock = this.A00;
        if (wakeLock == null) {
            return;
        }
        if (!this.A01 || !z) {
            C60270fk.A01(wakeLock);
        } else {
            C60270fk.A00(wakeLock);
        }
    }

    public final void setEnabled(boolean z) {
        if (z && this.A00 == null) {
            PowerManager powerManager = this.A03;
            if (powerManager == null) {
                2AG.A04("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            0BX.A02(newWakeLock, "ExoPlayer:WakeLockManager");
            this.A00 = newWakeLock;
            C60270fk.A02(newWakeLock);
        }
        this.A01 = z;
        PowerManager.WakeLock wakeLock = this.A00;
        if (wakeLock == null) {
            return;
        }
        if (!z || !this.A02) {
            C60270fk.A01(wakeLock);
        } else {
            C60270fk.A00(wakeLock);
        }
    }

    public AnonymousClass4T5(Context context) {
        this.A03 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
