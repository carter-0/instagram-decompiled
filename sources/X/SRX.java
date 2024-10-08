package X;

public final class SRX {
    public int A00;
    public int A01;
    public SRX A02;
    public SRX A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06;

    public final SRX A03() {
        this.A05 = true;
        return new SRX(this.A06, this.A01, this.A00, true, false);
    }

    public static long A00(SRX srx) {
        return (long) (srx.A00 - srx.A01);
    }

    public final SRX A02() {
        SRX srx = this.A02;
        SRX srx2 = null;
        if (srx != this) {
            srx2 = srx;
        }
        SRX srx3 = this.A03;
        srx3.A02 = srx;
        this.A02.A03 = srx3;
        this.A02 = null;
        this.A03 = null;
        return srx2;
    }

    public final SRX A04() {
        return new SRX((byte[]) this.A06.clone(), this.A01, this.A00, false, true);
    }

    public final void A05(SRX srx) {
        srx.A03 = this;
        srx.A02 = this.A02;
        this.A02.A03 = srx;
        this.A02 = srx;
    }

    public final void A06(SRX srx, int i) {
        if (srx.A04) {
            int i2 = srx.A00;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!srx.A05) {
                    int i4 = srx.A01;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = srx.A06;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        i2 = srx.A00 - srx.A01;
                        srx.A00 = i2;
                        srx.A01 = 0;
                    } else {
                        throw Pxe.A0g();
                    }
                } else {
                    throw Pxe.A0g();
                }
            }
            System.arraycopy(this.A06, this.A01, srx.A06, i2, i);
            srx.A00 += i;
            this.A01 += i;
            return;
        }
        throw Pxe.A0g();
    }

    public SRX(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.A06 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A04 = z2;
    }

    public static void A01(C13198TPe tPe, SRX srx) {
        tPe.A01 = srx.A02();
        C11318SMs.A01(srx);
    }

    public SRX() {
        this.A06 = new byte[8192];
        this.A04 = true;
        this.A05 = false;
    }
}
