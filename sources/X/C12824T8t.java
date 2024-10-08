package X;

import java.io.Closeable;

/* renamed from: X.T8t  reason: case insensitive filesystem */
public final class C12824T8t implements Closeable {
    public int A00 = -1;
    public int A01 = -1;
    public long A02 = -1;
    public C13198TPe A03;
    public boolean A04;
    public byte[] A05;
    public SRX A06;

    public final int A00(long j) {
        if (j >= -1) {
            C13198TPe tPe = this.A03;
            long j2 = tPe.A00;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.A06 = null;
                    this.A02 = j;
                    this.A05 = null;
                    this.A01 = -1;
                    this.A00 = -1;
                    return -1;
                }
                long j3 = 0;
                SRX srx = tPe.A01;
                SRX srx2 = srx;
                SRX srx3 = this.A06;
                if (srx3 != null) {
                    long j4 = this.A02 - ((long) (this.A01 - srx3.A01));
                    if (j4 > j) {
                        srx2 = srx3;
                        j2 = j4;
                    } else {
                        srx = srx3;
                        j3 = j4;
                    }
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        long A002 = SRX.A00(srx);
                        if (j < A002 + j3) {
                            break;
                        }
                        j3 += A002;
                        srx = srx.A02;
                    }
                } else {
                    while (j2 > j) {
                        srx2 = srx2.A03;
                        j2 -= SRX.A00(srx2);
                    }
                    j3 = j2;
                    srx = srx2;
                }
                if (this.A04 && srx.A05) {
                    SRX A042 = srx.A04();
                    C13198TPe tPe2 = this.A03;
                    if (tPe2.A01 == srx) {
                        tPe2.A01 = A042;
                    }
                    srx.A05(A042);
                    srx = A042;
                    A042.A03.A02();
                }
                this.A06 = srx;
                this.A02 = j;
                this.A05 = srx.A06;
                int i = srx.A01 + ((int) (j - j3));
                this.A01 = i;
                int i2 = srx.A00;
                this.A00 = i2;
                return i2 - i;
            }
        }
        throw Pxf.A0V("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.A03.A00)});
    }

    public final void close() {
        if (this.A03 != null) {
            this.A03 = null;
            this.A06 = null;
            this.A02 = -1;
            this.A05 = null;
            this.A01 = -1;
            this.A00 = -1;
            return;
        }
        throw AnonymousClass7TE.A0z("not attached to a buffer");
    }
}
