package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.GwJ  reason: case insensitive filesystem */
public final class C53913GwJ extends C251343mx {
    public final long A00;
    public final C62320sa A01;
    public final long A02;
    public final long A03;
    public final 2WX A04;
    public final HNO A05;
    public final HNO A06;
    public final HNO A07;
    public final CharSequence A08;
    public final Integer A09;
    public final C62320sa A0A;

    public final C251263mp A0X(AnonymousClass3Y5 r8) {
        0qQ.A0B(r8, 0);
        HNO hno = this.A05;
        int A002 = I61.A00(r8, hno);
        HNO hno2 = this.A06;
        int A003 = I61.A00(r8, hno2);
        Object[] objArr = {hno, hno2};
        Drawable drawable = (Drawable) AnonymousClass3Zw.A00(r8, new MJB(this, A003, r8, A002, 7), objArr);
        C62320sa r5 = this.A0A;
        if (r5 == null) {
            return A00(drawable, r8);
        }
        2Tp A004 = A00(drawable, r8);
        Integer num = AnonymousClass05K.A01;
        return new C53775Gu4(A004, 2WX.A02, new C57550Icc(num, AnonymousClass05K.A00, num), r5, (C62320sa) null);
    }

    private final 2Tp A00(Drawable drawable, C70832Wc r20) {
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0C = C51974G9v.A0C((2WX) null, C51965G9l.A0b(AnonymousClass05K.A01, 0.0f, 1), 0.0f);
        Integer num = AnonymousClass05K.A00;
        2WX A002 = C51971G9r.A0Z(C51973G9u.A0Q(AnonymousClass9JR.A00(G9t.A0z(G9t.A10(A0C, num, drawable), num, C243573Zh.FLEX_START), AnonymousClass05K.A1F, 2, C51969G9p.A0E()), C51965G9l.A0c(AnonymousClass05K.A04, 0, C51970G9q.A0I()), 0, C51969G9p.A0B()), num, C59105J6n.A02(this, 44), (String) null).A00(this.A04);
        C70832Wc r5 = r20;
        2Wb A0M = C51973G9u.A0M(r5);
        CharSequence charSequence = this.A08;
        Integer num2 = this.A09;
        return C51967G9n.A0O(new C53907GwD((2WX) null, AnonymousClass90N.TEXT_START, this.A07, charSequence, num2, 1, this.A03, this.A02), A0M, r5, A002);
    }

    public C53913GwJ(2WX r1, HNO hno, HNO hno2, HNO hno3, CharSequence charSequence, Integer num, C62320sa r7, C62320sa r8, long j, long j2, long j3) {
        this.A08 = charSequence;
        this.A01 = r7;
        this.A0A = r8;
        this.A07 = hno;
        this.A09 = num;
        this.A05 = hno2;
        this.A06 = hno3;
        this.A00 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A04 = r1;
    }
}
