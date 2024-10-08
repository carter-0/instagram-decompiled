package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Gtd  reason: case insensitive filesystem */
public final class C53748Gtd extends C251343mx {
    public final C56111Hsy A00;
    public final C62320sa A01;
    public final C56111Hsy A02;
    public final boolean A03;

    public final C251263mp A0X(AnonymousClass3Y5 r36) {
        2WX A0V;
        2Wb A0Q;
        C53949Gwt gwt;
        AnonymousClass3Y5 r14 = r36;
        0qQ.A0B(r14, 0);
        Drawable A002 = C55218He9.A00(r14, C58708IwH.A01(r14, 30), new Object[0]);
        Drawable A003 = C55218He9.A00(r14, C58708IwH.A01(r14, 31), new Object[0]);
        C56111Hsy hsy = this.A02;
        C243583Zi r20 = C243583Zi.SPACE_BETWEEN;
        AnonymousClass3XV r1 = 2WX.A02;
        if (hsy != null) {
            long A0F = C51969G9p.A0F();
            Integer num = AnonymousClass05K.A03;
            2WX A004 = AnonymousClass9JR.A00((2WX) null, num, 0, A0F);
            C59097J6f A012 = C59097J6f.A01(this, 3);
            Integer num2 = AnonymousClass05K.A1F;
            A0V = C51971G9r.A0Y(A004, num2, A012, 4);
            A0Q = C51972G9s.A0Q(r14);
            Integer num3 = AnonymousClass05K.A00;
            2WX A0X = C51971G9r.A0X((2WX) null, num3, 100.0f, 0);
            long A0E = C51969G9p.A0E();
            Integer num4 = AnonymousClass05K.A0F;
            2WX A005 = AnonymousClass9JR.A00(A0X, num4, 0, A0E);
            2Wb A0w = G9t.A0w(A0Q);
            A0w.A00(new C53907GwD(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0A, 0, C51970G9q.A0H()), (AnonymousClass90N) null, HNO.A0Y, this.A00.A01, num4, 0, 120));
            C243583Zi r15 = C243583Zi.FLEX_START;
            2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00((2WX) null, num, 0, A0F), num2, C59097J6f.A01(hsy, 5), 4);
            2Wb A0L = C51973G9u.A0L(A0w);
            A0L.A00(new C53907GwD((2WX) null, (AnonymousClass90N) null, HNO.A0h, hsy.A01, AnonymousClass05K.A0N, 0, 248));
            Drawable drawable = hsy.A00;
            if (drawable != null) {
                C51974G9v.A0h(drawable, A0L.A00, A0L, C51972G9s.A0S(C51971G9r.A0Y(C51974G9v.A0M((2WX) null, num3, 0, C51970G9q.A0D()), num3, C243573Zh.CENTER, 3), 0, C51970G9q.A0J()));
            }
            A0w.A00(C243563Zg.A0J(A0L, A0w, A0Y, r15));
            A0Q.A00(C243563Zg.A04(A0w, A0Q, A005));
            if (this.A03) {
                A003 = A002;
            }
            gwt = new C53949Gwt(A003, ImageView.ScaleType.CENTER_CROP, C51973G9u.A0X((2WX) null, num4, 20.0d, 0), 0, false);
        } else {
            A0V = C51972G9s.A0V(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A05, 0, C51970G9q.A0I()), AnonymousClass05K.A03, 0, C51969G9p.A0F()), C59097J6f.A01(this, 4));
            A0Q = C51972G9s.A0Q(r14);
            A0Q.A00(new C53907GwD(G9t.A0z((2WX) null, AnonymousClass05K.A00, C243573Zh.CENTER), (AnonymousClass90N) null, HNO.A0Y, this.A00.A01, AnonymousClass05K.A0F, 0, 120));
            if (this.A03) {
                A003 = A002;
            }
            gwt = new C53949Gwt(A003, ImageView.ScaleType.CENTER_CROP, (2WX) null, 0, false);
        }
        A0Q.A00(gwt);
        return C243563Zg.A0J(A0Q, r14, A0V, r20);
    }

    public C53748Gtd(C56111Hsy hsy, C56111Hsy hsy2, C62320sa r3, boolean z) {
        this.A00 = hsy;
        this.A02 = hsy2;
        this.A03 = z;
        this.A01 = r3;
    }
}
