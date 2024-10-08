package X;

import java.util.Map;

/* renamed from: X.SoX  reason: case insensitive filesystem */
public final class C12182SoX implements C13817Thl {
    public long A00;
    public int A01 = 1;
    public final long A02;
    public final long A03;
    public final long A04;

    public final boolean AJl() {
        return Dba.A1U((this.A00 > this.A02 ? 1 : (this.A00 == this.A02 ? 0 : -1)));
    }

    public final C13817Thl AKi() {
        return new C12182SoX(this.A04, this.A03, this.A02);
    }

    public final long B2S() {
        return this.A00;
    }

    public final Map BOA() {
        long j;
        int i = this.A01;
        if (i == 1) {
            j = 0;
        } else {
            j = this.A00;
        }
        return DbY.A0q(RH0.A0L.A00, String.valueOf(j), AnonymousClass7TE.A1L(RH0.A0M.A00, "backoff"), AnonymousClass7TE.A1L(RH0.A0J.A00, String.valueOf(i)));
    }

    public final void EAk() {
        this.A00 *= this.A03;
        this.A01++;
    }

    public C12182SoX(long j, long j2, long j3) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A00 = j;
    }
}
