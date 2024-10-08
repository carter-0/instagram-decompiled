package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4YP  reason: invalid class name */
public final class AnonymousClass4YP implements AnonymousClass4XE {
    public final long A00;
    public final AnonymousClass4YN A01;

    public final long B61(long j, long j2) {
        return 0;
    }

    public final long B6B() {
        return 0;
    }

    public final long BWL(long j, long j2) {
        return -9223372036854775807L;
    }

    public final int BeW(long j) {
        return -1;
    }

    public final long BrT(long j) {
        return -1;
    }

    public final boolean isExplicit() {
        return true;
    }

    public final long AeC(long j, long j2) {
        return (long) this.A01.A00;
    }

    public final long AzV(long j, long j2) {
        return this.A01.A03[(int) j];
    }

    public final long BrO(long j) {
        return (long) this.A01.A00;
    }

    public final long BrS(long j, long j2) {
        return (long) Util.A04(this.A01.A05, j + this.A00, true);
    }

    public final C256573vz BrV(long j) {
        AnonymousClass4YN r2 = this.A01;
        int i = (int) j;
        return new C256573vz((String) null, r2.A04[i], (long) r2.A02[i]);
    }

    public final long C7P(long j) {
        return this.A01.A05[(int) j] - this.A00;
    }

    public AnonymousClass4YP(AnonymousClass4YN r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
