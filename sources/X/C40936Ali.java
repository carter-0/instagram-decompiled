package X;

import android.os.SystemClock;

/* renamed from: X.Ali  reason: case insensitive filesystem */
public final class C40936Ali implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C341487my A01;

    public C40936Ali(C341487my r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C341487my r2 = this.A01;
        C3730593v r4 = r2.A02;
        if (r4 != null) {
            int i = this.A00;
            int i2 = -1;
            if (i == -3 || i == -2) {
                i2 = 5;
            } else if (i == -1) {
                i2 = 4;
            } else if (i == 1) {
                i2 = 6;
            }
            C341457mv r22 = r2.A01;
            if (r22 != null) {
                r22.A03 = Integer.valueOf(i2);
                r22.A01 = SystemClock.elapsedRealtime();
            }
            r4.onReceivedAudioMixingMode(i2);
        }
    }
}
