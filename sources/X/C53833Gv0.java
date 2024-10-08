package X;

/* renamed from: X.Gv0  reason: case insensitive filesystem */
public final class C53833Gv0 extends C251343mx {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C21255XRa A03;
    public final 2WX A04;
    public final AnonymousClass90N A05;
    public final CharSequence A06;
    public final Integer A07;

    public final C251263mp A0X(AnonymousClass3Y5 r11) {
        CharSequence charSequence = this.A06;
        C57552Ice ice = new C57552Ice(this.A03, this.A07);
        int i = this.A00;
        AnonymousClass90N r4 = this.A05;
        HHT hht = new HHT(this.A02, this.A01);
        AnonymousClass3XV r3 = this.A04;
        if (r3 == null) {
            r3 = 2WX.A02;
        }
        return new C53813Gug(r3, r4, AnonymousClass90P.TOP, ice, hht, charSequence, i);
    }

    public C53833Gv0(C21255XRa xRa, 2WX r2, AnonymousClass90N r3, CharSequence charSequence, Integer num, int i, long j, long j2) {
        this.A06 = charSequence;
        this.A07 = num;
        this.A03 = xRa;
        this.A00 = i;
        this.A05 = r3;
        this.A02 = j;
        this.A01 = j2;
        this.A04 = r2;
    }
}
