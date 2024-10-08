package X;

/* renamed from: X.GuT  reason: case insensitive filesystem */
public final class C53800GuT extends C251343mx {
    public final C251263mp A00;
    public final C251263mp A01;
    public final String A02;
    public final 2WX A03;
    public final String A04;
    public final C62320sa A05;

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        C251263mp r2;
        AnonymousClass3Y5 r8 = r23;
        0qQ.A0B(r8, 0);
        2WX r7 = this.A03;
        String str = this.A04;
        C243583Zi r6 = C243583Zi.FLEX_START;
        2Wb A0S = AnonymousClass7TG.A0S(r8.Aqq());
        C251263mp r11 = this.A00;
        if (r11 != null) {
            AnonymousClass3XV r22 = 2WX.A02;
            r2 = C243563Zg.A0B(G9t.A0v(r11, A0S.A00), A0S, AnonymousClass9JR.A00(G9t.A0x((2WX) null, AnonymousClass05K.A0C, 0.0f), AnonymousClass05K.A1F, 0, C56493HzP.A06));
        } else {
            r2 = null;
        }
        A0S.A00(r2);
        2V1 r3 = A0S.A00;
        2Wb A0S2 = AnonymousClass7TG.A0S(r3);
        Integer num = AnonymousClass05K.A06;
        HNO hno = HNO.A0Y;
        AnonymousClass90N r13 = AnonymousClass90N.TEXT_START;
        long A0J = C51970G9q.A0J();
        long A0H = C51970G9q.A0H();
        A0S2.A00(new C53907GwD((2WX) null, r13, hno, str, num, 0, A0J, A0H));
        String str2 = this.A02;
        if (!(str2 == null || str2.length() == 0)) {
            A0S2.A00(new C53907GwD((2WX) null, r13, HNO.A0h, str2, AnonymousClass05K.A0C, 0, A0J, A0H));
        }
        A0S.A00(C243563Zg.A00(A0S2));
        AnonymousClass3XV r15 = 2WX.A02;
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X = C51971G9r.A0X(C51971G9r.A0X((2WX) null, num2, 1.0f, 1), AnonymousClass05K.A0C, 0.0f, 1);
        2Wb A0S3 = AnonymousClass7TG.A0S(r3);
        A0S3.A00(this.A01);
        A0S.A00(C243563Zg.A0C(A0S3, A0S, A0X));
        2Tp A0K = C243563Zg.A0K(A0S, r8, r7, r6);
        C57550Icc icc = new C57550Icc(num2, num2, num2);
        C62320sa r0 = this.A05;
        if (r0 == null) {
            r0 = C58567Iu0.A00;
        }
        return new C53775Gu4(A0K, r15, icc, r0, (C62320sa) null);
    }

    public C53800GuT(C251263mp r1, C251263mp r2, 2WX r3, String str, String str2, C62320sa r6) {
        this.A03 = r3;
        this.A04 = str;
        this.A02 = str2;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
    }
}
