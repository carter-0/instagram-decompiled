package X;

import com.google.android.exoplayer2.util.Util;

public final class Q0R implements C13784Tgz {
    public final int A00;
    public final int A01;
    public final AnonymousClass4XV A02;

    public final int B6R() {
        return this.A00;
    }

    public final int BpA() {
        return this.A01;
    }

    public final int E6b() {
        int i = this.A00;
        if (i == -1) {
            return this.A02.A04();
        }
        return i;
    }

    public Q0R(C256683wB r6, AnonymousClass4YA r7) {
        AnonymousClass4XV r4 = r7.A00;
        this.A02 = r4;
        r4.A0G(12);
        int A04 = r4.A04();
        if ("audio/raw".equals(r6.A0W)) {
            int A03 = Util.A03(r6.A0C, r6.A06);
            if (A04 == 0 || A04 % A03 != 0) {
                2AG.A04("AtomParsers", 002.A02(A03, A04, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                A04 = A03;
            }
            this.A00 = A04;
            this.A01 = r4.A04();
        }
        if (A04 == 0) {
            A04 = -1;
        }
        this.A00 = A04;
        this.A01 = r4.A04();
    }
}
