package X;

import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: X.3Pi  reason: invalid class name and case insensitive filesystem */
public final class C241473Pi extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C240773Mj[] A03;
    public final long A04;

    public C241473Pi(C240773Mj[] r3, int i, int i2, long j) {
        0qQ.A0B(r3, 1);
        this.A03 = r3;
        this.A04 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = SystemClock.elapsedRealtime() - j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C241473Pi) {
                C241473Pi r8 = (C241473Pi) obj;
                if (!(0qQ.A0K(this.A03, r8.A03) && this.A04 == r8.A04 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A04;
        return (((((Arrays.hashCode(this.A03) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A00) * 31) + this.A01;
    }
}
