package X;

import java.io.IOException;
import java.util.Locale;

/* renamed from: X.4XR  reason: invalid class name */
public final class AnonymousClass4XR {
    public long A00;
    public long A01;
    public AnonymousClass4XE A02;
    public C256733wG A03;
    public final long A04;
    public final C257163wx A05;
    public final C265014Se A06;
    public final C256383vg A07;
    public final boolean A08;

    public final long A00() {
        if (this.A02.BrO(this.A00) == -1) {
            return -1;
        }
        AnonymousClass4XE r4 = this.A02;
        return ((r4.B6B() + this.A01) + r4.BrO(this.A00)) - 1;
    }

    public final long A01(long j) {
        return ((this.A02.B61(this.A00, j) + this.A01) + this.A02.AeC(this.A00, j)) - 1;
    }

    public final long A02(long j) {
        AnonymousClass4XE r7 = this.A02;
        long j2 = this.A01;
        long j3 = j - j2;
        long B6B = r7.B6B();
        if (j3 >= B6B) {
            return r7.AzV(j3, this.A00);
        }
        throw new IOException(String.format(Locale.US, "Segment number without shift number is behind, segmentNum=%d ,segmentNumShift=%d ,firstSegmentNum=%d", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(B6B)}));
    }

    public final long A03(long j) {
        return this.A02.C7P(j - this.A01) + this.A02.AzV(j - this.A01, this.A00);
    }

    public final long A04(long j) {
        return this.A02.BrS(j, this.A00) + this.A01;
    }

    public final boolean A05(long j) {
        AnonymousClass4XE r2 = this.A02;
        long B6B = (r2.B6B() + r2.BrO(this.A00)) - 1;
        if (j < this.A04 + this.A02.C7P(B6B) + this.A02.AzV(B6B, this.A00)) {
            return true;
        }
        return false;
    }

    public AnonymousClass4XR(C257163wx r1, C265014Se r2, AnonymousClass4XE r3, C256383vg r4, C256733wG r5, long j, long j2, long j3, boolean z) {
        this.A04 = j;
        this.A00 = j2;
        this.A03 = r5;
        this.A07 = r4;
        this.A01 = j3;
        this.A06 = r2;
        this.A02 = r3;
        this.A08 = z;
        this.A05 = r1 == null ? new C257153ww() : r1;
    }
}
