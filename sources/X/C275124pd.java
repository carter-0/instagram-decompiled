package X;

import android.os.SystemClock;

/* renamed from: X.4pd  reason: invalid class name and case insensitive filesystem */
public final class C275124pd extends C274904pH implements C275104pb {
    public int A00;
    public final long[] A01 = new long[5];

    public final void ASk(boolean z) {
        long[] jArr = this.A01;
        synchronized (jArr) {
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            jArr[i] = SystemClock.uptimeMillis();
            this.A00 = i2 % jArr.length;
        }
    }

    public C275124pd() {
        C274794p6.A02.A00(this);
    }
}
