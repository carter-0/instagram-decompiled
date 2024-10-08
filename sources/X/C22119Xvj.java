package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Xvj  reason: case insensitive filesystem */
public final class C22119Xvj implements YAM {
    public long A00;
    public long A01;
    public C21376XZj A02;
    public C22017XrB A03;

    public final C13511Tbc AMz() {
        long j = this.A00;
        C11366SPh.A02(AnonymousClass7TF.A1P((j > -1 ? 1 : (j == -1 ? 0 : -1))));
        return new C22110Xva(this.A03, j);
    }

    public final long E6B(C13910TlA tlA) {
        long j = this.A01;
        if (j < 0) {
            return -1;
        }
        long j2 = -(j + 2);
        this.A01 = -1;
        return j2;
    }

    public final void Exb(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[Util.A02(jArr, j, true)];
    }
}
