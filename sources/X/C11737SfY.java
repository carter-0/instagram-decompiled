package X;

/* renamed from: X.SfY  reason: case insensitive filesystem */
public final class C11737SfY implements C22557YAo {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public C13900TjN A03;
    public boolean A04;
    public final C11389SRd A05 = Pxe.A0P(10);

    public final void EKt() {
        this.A04 = false;
        this.A02 = -9223372036854775807L;
    }

    public final void AJP(C11389SRd sRd) {
        C11366SPh.A00(this.A03);
        if (this.A04) {
            int i = sRd.A00;
            int i2 = sRd.A01;
            int i3 = i - i2;
            int i4 = this.A00;
            if (i4 < 10) {
                int min = Math.min(i3, 10 - i4);
                byte[] bArr = sRd.A02;
                C11389SRd sRd2 = this.A05;
                System.arraycopy(bArr, i2, sRd2.A02, i4, min);
                if (this.A00 + min == 10) {
                    sRd2.A0O(0);
                    if (73 == sRd2.A05() && 68 == sRd2.A05() && 51 == sRd2.A05()) {
                        sRd2.A0P(3);
                        this.A01 = sRd2.A04() + 10;
                    } else {
                        STH.A03("Id3Reader", "Discarding invalid ID3 tag");
                        this.A04 = false;
                        return;
                    }
                }
            }
            int A042 = Pxh.A04(this.A01, this.A00, i3);
            this.A03.EJf(sRd, A042);
            this.A00 += A042;
        }
    }

    public final void E1X(boolean z) {
        int i;
        C13900TjN tjN = this.A03;
        C11366SPh.A00(tjN);
        if (this.A04 && (i = this.A01) != 0 && this.A00 == i) {
            long j = this.A02;
            C11366SPh.A02(AnonymousClass7TF.A1P((j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1))));
            tjN.EJm((S4h) null, 1, i, 0, j);
            this.A04 = false;
        }
    }

    public final void E1Y(long j, int i) {
        if ((i & 4) != 0) {
            this.A04 = true;
            this.A02 = j;
            this.A01 = 0;
            this.A00 = 0;
        }
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        sr8.A03();
        SR8.A02(sr8);
        C13900TjN FHV = ybz.FHV(sr8.A00, 5);
        this.A03 = FHV;
        SOW A002 = SOW.A00();
        SR8.A02(sr8);
        A002.A0T = sr8.A01;
        A002.A01("application/id3");
        C13900TjN.A00(A002, FHV);
    }
}
