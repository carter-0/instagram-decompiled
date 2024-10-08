package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4TB  reason: invalid class name */
public final class AnonymousClass4TB {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C264874Rq A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public AnonymousClass4TB(C264874Rq r2, long j, long j2, long j3, long j4, boolean z) {
        this.A04 = r2;
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
        this.A07 = true;
        this.A05 = z;
        this.A06 = false;
        this.A08 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4TB r7 = (AnonymousClass4TB) obj;
            if (!(this.A03 == r7.A03 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A06 == r7.A06 && this.A07 == r7.A07 && this.A08 == r7.A08 && this.A05 == r7.A05 && Util.A0I(this.A04, r7.A04))) {
                return false;
            }
        }
        return true;
    }

    public final AnonymousClass4TB A00(long j) {
        long j2 = j;
        if (j == this.A02) {
            return this;
        }
        return new AnonymousClass4TB(this.A04, this.A03, j2, this.A01, this.A00, this.A06, this.A07, this.A08, this.A05);
    }

    public final AnonymousClass4TB A01(long j) {
        long j2 = j;
        if (j == this.A03) {
            return this;
        }
        return new AnonymousClass4TB(this.A04, j2, this.A02, this.A01, this.A00, this.A06, this.A07, this.A08, this.A05);
    }

    public final int hashCode() {
        return ((((((((((((((((527 + this.A04.hashCode()) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + ((int) this.A00)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }

    public AnonymousClass4TB(C264874Rq r1, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = r1;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = j4;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A05 = z4;
    }
}
