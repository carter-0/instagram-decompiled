package X;

import android.text.TextUtils;

/* renamed from: X.Gvn  reason: case insensitive filesystem */
public final class C53882Gvn extends C251343mx {
    public final C62320sa A00;

    public final C251263mp A0X(AnonymousClass3Y5 r18) {
        AnonymousClass3Y5 r4 = r18;
        boolean A1Z = C51966G9m.A1Z(r4);
        long A0E = C51970G9q.A0E();
        long A0D = C51970G9q.A0D();
        2WX A0R = C51973G9u.A0R((2WX) null, C51965G9l.A0c(AnonymousClass05K.A07, A1Z ? 1 : 0, A0D), A1Z, A0D);
        Integer num = AnonymousClass05K.A0A;
        2WX A0x = G9t.A0x(AnonymousClass9JR.A00(A0R, num, A1Z, A0E), AnonymousClass05K.A01, 1.0f);
        2Wb A0Q = C51972G9s.A0Q(r4);
        String A0E2 = C244013aV.A0E(A0Q, 2131966299);
        J6R A002 = J6R.A00(this, C59105J6n.A02(A0Q, 45), 6);
        C52813Gd5 gd5 = new C52813Gd5(A0Q);
        A002.invoke(gd5);
        CharSequence expandTemplate = TextUtils.expandTemplate(A0E2, new CharSequence[]{gd5});
        0qQ.A07(expandTemplate);
        HNO hno = HNO.A0Y;
        AnonymousClass90N r8 = AnonymousClass90N.CENTER;
        long A0B = C51969G9p.A0B();
        A0Q.A00(new C53907GwD((2WX) null, r8, hno, expandTemplate, num, A1Z, A0B, A0B));
        return C243563Zg.A0F(A0Q, r4, A0x);
    }

    public C53882Gvn(C62320sa r1) {
        this.A00 = r1;
    }

    public C53882Gvn() {
        this((C62320sa) null);
    }
}
