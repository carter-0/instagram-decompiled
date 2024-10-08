package X;

/* renamed from: X.Gug  reason: case insensitive filesystem */
public final class C53813Gug extends C251343mx {
    public final int A00;
    public final AnonymousClass90N A01;
    public final AnonymousClass90P A02;
    public final C54720HPz A03;
    public final 2WX A04;
    public final JT8 A05;
    public final CharSequence A06;

    public C53813Gug(2WX r2, AnonymousClass90N r3, AnonymousClass90P r4, JT8 jt8, C54720HPz hPz, CharSequence charSequence, int i) {
        DbW.A1N(charSequence, 1, r3);
        this.A06 = charSequence;
        this.A05 = jt8;
        this.A03 = hPz;
        this.A00 = i;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r6) {
        0qQ.A0B(r6, 0);
        Object A022 = I3I.A02(r6, this.A05);
        Object[] objArr = {Integer.valueOf(this.A00), this.A01, this.A03, this.A02, A022};
        CharSequence charSequence = this.A06;
        return new C53939Gwj(this.A04, (AnonymousClass90O) AnonymousClass3Zw.A00(r6, C58697Iw6.A00(A022, r6, this, 11), objArr), charSequence);
    }
}
