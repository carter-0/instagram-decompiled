package X;

/* renamed from: X.GwD  reason: case insensitive filesystem */
public final class C53907GwD extends C251343mx {
    public final int A00;
    public final long A01;
    public final long A02;
    public final 2WX A03;
    public final AnonymousClass90N A04;
    public final HNO A05;
    public final CharSequence A06;
    public final Integer A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C53907GwD(X.2WX r13, X.AnonymousClass90N r14, X.HNO r15, java.lang.CharSequence r16, java.lang.Integer r17, int r18, int r19) {
        /*
            r12 = this;
            r1 = r19
            r2 = r13
            r3 = r14
            r7 = r18
            r0 = r19 & 8
            if (r0 == 0) goto L_0x000b
            r7 = 0
        L_0x000b:
            r0 = r19 & 16
            if (r0 == 0) goto L_0x0011
            X.90N r3 = X.AnonymousClass90N.TEXT_START
        L_0x0011:
            r0 = r19 & 32
            if (r0 == 0) goto L_0x0033
            long r8 = X.C51970G9q.A0J()
        L_0x0019:
            r0 = r19 & 64
            if (r0 == 0) goto L_0x0030
            long r10 = X.C51970G9q.A0J()
        L_0x0021:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0026
            r2 = 0
        L_0x0026:
            r1 = r12
            r4 = r15
            r5 = r16
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
            return
        L_0x0030:
            r10 = 0
            goto L_0x0021
        L_0x0033:
            r8 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53907GwD.<init>(X.2WX, X.90N, X.HNO, java.lang.CharSequence, java.lang.Integer, int, int):void");
    }

    public final C251263mp A0X(AnonymousClass3Y5 r11) {
        CharSequence charSequence = this.A06;
        C57551Icd icd = new C57551Icd(this.A05, this.A07);
        int i = this.A00;
        return new C53813Gug(this.A03, this.A04, AnonymousClass90P.TOP, icd, new HHT(this.A02, this.A01), charSequence, i);
    }

    public C53907GwD(2WX r2, AnonymousClass90N r3, HNO hno, CharSequence charSequence, Integer num, int i, long j, long j2) {
        AnonymousClass7TG.A1U(charSequence, num, hno);
        0qQ.A0B(r3, 5);
        this.A06 = charSequence;
        this.A07 = num;
        this.A05 = hno;
        this.A00 = i;
        this.A04 = r3;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = r2;
    }
}
