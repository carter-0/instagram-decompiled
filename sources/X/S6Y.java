package X;

public final class S6Y {
    public int A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public final byte[] A06 = new byte[10];

    public final void A00(C13910TlA tlA) {
        if (!this.A01) {
            byte[] bArr = this.A06;
            tlA.E2F(bArr, 0, 10);
            tlA.EI7();
            boolean z = false;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b = bArr[7];
                if ((b & 254) == 186) {
                    if ((b & 255) == 187) {
                        z = true;
                    }
                    char c = 8;
                    if (z) {
                        c = 9;
                    }
                    if ((40 << ((bArr[c] >> 4) & 7)) != 0) {
                        this.A01 = true;
                    }
                }
            }
        }
    }

    public final void A01(S4h s4h, C13900TjN tjN) {
        if (this.A00 > 0) {
            S4h s4h2 = s4h;
            C13900TjN tjN2 = tjN;
            tjN2.EJm(s4h2, this.A02, this.A04, this.A03, this.A05);
            this.A00 = 0;
        }
    }

    public final void A02(S4h s4h, C13900TjN tjN, int i, int i2, int i3, long j) {
        if (!Pxg.A1T(this.A03, i2 + i3)) {
            throw AnonymousClass7TE.A0z(String.valueOf("TrueHD chunk samples must be contiguous in the sample queue."));
        } else if (this.A01) {
            int i4 = this.A00;
            int i5 = i4 + 1;
            this.A00 = i5;
            if (i4 == 0) {
                this.A05 = j;
                this.A02 = i;
                this.A04 = 0;
            }
            this.A04 += i2;
            this.A03 = i3;
            if (i5 >= 16) {
                A01(s4h, tjN);
            }
        }
    }
}
