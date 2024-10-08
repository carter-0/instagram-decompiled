package X;

/* renamed from: X.TqJ  reason: case insensitive filesystem */
public final class C14124TqJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public final /* synthetic */ C14121TqG A09;

    public C14124TqJ(C14121TqG tqG, int i, int i2) {
        this.A09 = tqG;
        this.A00 = i;
        this.A08 = i2;
        A00();
    }

    public final void A00() {
        C14121TqG tqG = this.A09;
        int[] iArr = tqG.A02;
        int[] iArr2 = tqG.A03;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = AnonymousClass972.MUTABLE_FLAG_MASK;
        int i5 = AnonymousClass972.MUTABLE_FLAG_MASK;
        int i6 = AnonymousClass972.MUTABLE_FLAG_MASK;
        int i7 = 0;
        for (int i8 = this.A00; i8 <= this.A08; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i4) {
                i4 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
        }
        this.A06 = i;
        this.A03 = i4;
        this.A05 = i2;
        this.A02 = i5;
        this.A04 = i3;
        this.A01 = i6;
        this.A07 = i7;
    }
}
