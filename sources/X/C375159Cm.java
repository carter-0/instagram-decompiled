package X;

import android.os.SystemClock;

/* renamed from: X.9Cm  reason: invalid class name and case insensitive filesystem */
public final class C375159Cm implements 14w {
    public long A00 = -1;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;

    public final void onPostReleaseBoost(14s r9, int i, boolean z) {
        if (z) {
            this.A02++;
        }
        this.A01++;
        long j = this.A00;
        if (j > -1) {
            this.A03 += SystemClock.uptimeMillis() - j;
            this.A00 = -1;
        }
    }

    public final void onPostRequestBoost(14s r3, boolean z, int i) {
        if (z) {
            this.A00 = SystemClock.uptimeMillis();
        }
    }

    public final void onPreReleaseBoost(14s r1, int i, boolean z) {
    }
}
