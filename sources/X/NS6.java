package X;

import android.os.PowerManager;

public final class NS6 extends 0ng {
    public final /* synthetic */ PowerManager.WakeLock A00;
    public final /* synthetic */ Runnable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NS6(PowerManager.WakeLock wakeLock, Runnable runnable) {
        super(53, 3, false, false);
        this.A01 = runnable;
        this.A00 = wakeLock;
    }

    public final void run() {
        try {
            this.A01.run();
        } finally {
            C60270fk.A01(this.A00);
        }
    }
}
