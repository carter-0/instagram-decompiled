package X;

public final class HAS extends C296935qt implements C296955qv, C296975qx {
    public long A00 = -1;
    public 1Xj A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final long A00() {
        C295805ow r0;
        if (this.A02 == AnonymousClass05K.A01) {
            r0 = C295805ow.CHANNEL;
        } else {
            r0 = C295805ow.MEDIA;
        }
        return r0.A00;
    }

    public final 1Xj BPf() {
        return this.A01;
    }

    public final long BaJ() {
        return this.A00;
    }

    public final boolean CP9() {
        return this.A06;
    }

    public HAS(C296905qq r3, C295795ov r4, 1Xj r5, Integer num, String str, String str2, String str3, boolean z) {
        super(r3, r4, str);
        this.A03 = str;
        this.A01 = r5;
        this.A02 = num;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = z;
    }

    public final String getId() {
        return getKey();
    }

    public final void EfJ(long j) {
        this.A00 = j;
    }
}
