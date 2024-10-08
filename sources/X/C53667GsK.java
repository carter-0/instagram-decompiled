package X;

import android.text.TextUtils;

/* renamed from: X.GsK  reason: case insensitive filesystem */
public final class C53667GsK extends C251343mx {
    public final 2WX A00;
    public final String A01;

    public C53667GsK(2WX r2, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r40) {
        AnonymousClass3Y5 r38 = r40;
        boolean A1Z = C51966G9m.A1Z(r38);
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, A1Z ? 1 : 0));
        Integer num2 = AnonymousClass05K.A01;
        2WX A002 = C51971G9r.A0X(A0X, num2, 100.0f, A1Z).A00(this.A00);
        2Wb A0S = AnonymousClass7TG.A0S(r38.A05);
        2WX A0x = G9t.A0x((2WX) null, num2, 1.0f);
        2V1 r37 = A0S.A00;
        2Wb A0S2 = AnonymousClass7TG.A0S(r37);
        long A0E = C51969G9p.A0E();
        long A0K = C51970G9q.A0K();
        Integer num3 = AnonymousClass05K.A0E;
        2WX A0H = C51974G9v.A0H((2WX) null, C51965G9l.A0c(num3, A1Z, A0E), A1Z, A0K);
        CharSequence expandTemplate = TextUtils.expandTemplate(C244013aV.A0E(A0S2, 2131966001), new CharSequence[]{this.A01});
        0qQ.A07(expandTemplate);
        HNO hno = HNO.A0Y;
        Integer num4 = AnonymousClass05K.A03;
        AnonymousClass90N r19 = AnonymousClass90N.CENTER;
        long A0B = C51969G9p.A0B();
        A0S2.A00(new C53907GwD(A0H, r19, hno, expandTemplate, num4, A1Z ? 1 : 0, A0B, A0B));
        AnonymousClass90N r28 = r19;
        C51971G9r.A1F(new C53907GwD(AnonymousClass9JR.A00(C51973G9u.A0X((2WX) null, num3, 25.0d, A1Z), AnonymousClass05K.A0F, A1Z, A0E), r28, HNO.A0h, C244013aV.A0E(A0S2, 2131966000), num, A1Z ? 1 : 0, A0B, A0B), A0S2, A0S, A0x);
        2WX A0S3 = C51973G9u.A0S(C51974G9v.A0F((2WX) null, C51965G9l.A0c(num3, A1Z, G9w.A04()), A1Z, A0K), C51965G9l.A0c(num2, A1Z, C51969G9p.A0C()), num, 100.0f, A1Z);
        2Wb A0S4 = AnonymousClass7TG.A0S(r37);
        A0S4.A00(new C53861GvS(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0G, A1Z, A0E), (HNO) null, (HNO) null, (HNO) null, C244013aV.A0E(A0S4, 2131966043), num, num, num, (Integer) null, C58688Ivx.A00(A0S4, this, 14)));
        C51967G9n.A1C(A0S4, A0S, A0S3);
        return C243563Zg.A05(A0S, r38, A002);
    }
}
