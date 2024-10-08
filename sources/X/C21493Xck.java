package X;

import android.os.SystemClock;

/* renamed from: X.Xck  reason: case insensitive filesystem */
public final class C21493Xck {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = -1;
    public long A07 = 0;
    public long A08 = 0;
    public String A09 = "";
    public String A0A = null;
    public boolean A0B = false;
    public boolean A0C = false;
    public final long A0D;
    public final int A0E;
    public final int A0F;

    public C21493Xck(int i, int i2) {
        this.A0F = i;
        this.A0E = i2;
        this.A0D = SystemClock.uptimeMillis();
    }

    public final int A00() {
        return this.A0E;
    }

    public final int A01() {
        return this.A0F;
    }
}
