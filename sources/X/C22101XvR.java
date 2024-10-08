package X;

/* renamed from: X.XvR  reason: case insensitive filesystem */
public final class C22101XvR implements YA3 {
    public final int A00;
    public final XYq A01 = new Object();
    public final C22017XrB A02;

    public final /* synthetic */ void DiN() {
    }

    private long A00(C13910TlA tlA) {
        C13910TlA tlA2;
        long length;
        long j;
        int E2C;
        while (true) {
            tlA2 = tlA;
            long BbM = tlA2.BbM();
            length = tlA2.getLength();
            j = length - 6;
            if (BbM >= j) {
                break;
            }
            C22017XrB xrB = this.A02;
            int i = this.A00;
            XYq xYq = this.A01;
            byte[] bArr = new byte[2];
            tlA2.E2F(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i) {
                C11389SRd A0P = Pxe.A0P(16);
                System.arraycopy(bArr, 0, A0P.A02, 0, 2);
                byte[] bArr2 = A0P.A02;
                int i2 = 0;
                do {
                    E2C = tlA2.E2C(bArr2, i2 + 2, 14 - i2);
                    if (E2C == -1 || (i2 = i2 + E2C) >= 14) {
                        A0P.A0N(i2);
                        tlA2.EI7();
                        tlA2.AAu((int) (BbM - tlA2.Bdl()));
                    }
                    E2C = tlA2.E2C(bArr2, i2 + 2, 14 - i2);
                    break;
                } while ((i2 = i2 + E2C) >= 14);
                A0P.A0N(i2);
                tlA2.EI7();
                tlA2.AAu((int) (BbM - tlA2.Bdl()));
                if (C21510Xdc.A01(A0P, xYq, xrB, i)) {
                    break;
                }
            } else {
                tlA2.EI7();
                tlA2.AAu((int) (BbM - tlA2.Bdl()));
            }
            tlA2.AAu(1);
        }
        long BbM2 = tlA2.BbM();
        if (BbM2 < j) {
            return this.A01.A00;
        }
        tlA2.AAu((int) (length - BbM2));
        return this.A02.A09;
    }

    public final Xn1 EKq(C13910TlA tlA, long j) {
        C13910TlA tlA2 = tlA;
        long Bdl = tlA2.Bdl();
        long A002 = A00(tlA2);
        long BbM = tlA2.BbM();
        tlA2.AAu(Math.max(6, this.A02.A06));
        long A003 = A00(tlA2);
        long BbM2 = tlA2.BbM();
        if (A002 <= j && A003 > j) {
            return new Xn1(-9223372036854775807L, BbM, 0);
        }
        if (A003 <= j) {
            return new Xn1(A003, BbM2, -2);
        }
        return new Xn1(A002, Bdl, -1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XYq, java.lang.Object] */
    public C22101XvR(C22017XrB xrB, int i) {
        this.A02 = xrB;
        this.A00 = i;
    }
}
