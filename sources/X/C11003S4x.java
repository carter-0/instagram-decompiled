package X;

/* renamed from: X.S4x  reason: case insensitive filesystem */
public final class C11003S4x {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public final C13900TjN A07;

    public final void A00(long j, int i, boolean z) {
        long j2 = this.A02;
        C11366SPh.A02(AnonymousClass7TF.A1P((j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1))));
        if (this.A00 == 182 && z && this.A04) {
            int i2 = (int) (j - this.A06);
            this.A07.EJm((S4h) null, this.A05 ? 1 : 0, i2, i, j2);
        }
        if (this.A00 != 179) {
            this.A06 = j;
        }
    }

    public final void A01(byte[] bArr, int i, int i2) {
        if (this.A03) {
            int i3 = this.A01;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.A05 = AnonymousClass7TF.A1Q((bArr[i4] & 192) >> 6);
                this.A03 = false;
                return;
            }
            this.A01 = i3 + (i2 - i);
        }
    }

    public C11003S4x(C13900TjN tjN) {
        this.A07 = tjN;
    }
}
