package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

/* renamed from: X.Gu6  reason: case insensitive filesystem */
public final class C53777Gu6 extends C251343mx {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final C56125HtD A03;
    public final boolean A04;

    public C53777Gu6(C56125HtD htD, String str, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A03 = htD;
        this.A04 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r41) {
        String str;
        double d;
        AnonymousClass2WY A0b;
        Integer num;
        AnonymousClass3Y5 r12 = r41;
        0qQ.A0B(r12, 0);
        Object A002 = AnonymousClass3Zw.A00(r12, C58688Ivx.A00(r12, this, 9), new Object[0]);
        Drawable A003 = C55218He9.A00(r12, C58714IwN.A01(r12, 15), new Object[0]);
        C56125HtD htD = this.A03;
        if (htD != null) {
            str = htD.A00;
        } else {
            str = null;
        }
        boolean z = this.A02;
        if (z) {
            d = 20.0d;
        } else {
            d = 16.0d;
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        AnonymousClass3XV r1 = 2WX.A02;
        Integer num2 = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X((2WX) null, num2, 100.0f, 0);
        2Wb A0Q = C51972G9s.A0Q(r12);
        boolean z2 = this.A04;
        if (z2 && !this.A01) {
            A0Q.A00(new C53639Grs(AnonymousClass9JR.A00(C51974G9v.A0M((2WX) null, num2, 0, C51970G9q.A0C()), AnonymousClass05K.A0E, 0, C51969G9p.A0F())));
        }
        2WX A0X2 = C51971G9r.A0X((2WX) null, num2, 100.0f, 0);
        Integer num3 = AnonymousClass05K.A01;
        2WX A0X3 = C51971G9r.A0X(A0X2, num3, 75.0f, 0);
        int i = 32;
        if (z2) {
            i = 16;
        }
        long A07 = C51965G9l.A07(i);
        Integer num4 = AnonymousClass05K.A0u;
        2WX A0Y = C51971G9r.A0Y(C51974G9v.A0E(C51974G9v.A0G(A0X3, C51965G9l.A0c(num4, 0, doubleToRawLongBits), 0, A07), C51965G9l.A0c(AnonymousClass05K.A1F, 0, doubleToRawLongBits), 0, doubleToRawLongBits), num2, A002, 4);
        2Wb A0w = G9t.A0w(A0Q);
        if (!z) {
            String A0E = C244013aV.A0E(A0w, 2131966332);
            boolean z3 = this.A01;
            if (z3) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A08;
            }
            HNO hno = HNO.A0R;
            long A0H = C51970G9q.A0H();
            A0w.A00(new C53907GwD((2WX) null, AnonymousClass90N.TEXT_START, hno, A0E, num, 2, A0H, A0H));
            if (z3) {
                num4 = AnonymousClass05K.A0G;
            }
            A0b = C51965G9l.A0c(AnonymousClass05K.A0N, 0, Double.doubleToRawLongBits(160.0d));
        } else {
            num4 = AnonymousClass05K.A03;
            A0b = C51965G9l.A0b(num3, 1.0f, 1);
        }
        2WX A0X4 = C51965G9l.A0X((2WX) null, A0b);
        long A0J = C51970G9q.A0J();
        Integer num5 = AnonymousClass05K.A08;
        2WX A0y = G9t.A0y(AnonymousClass9JR.A00((2WX) null, num5, 0, A0J), num2, 0);
        2Wb A0L = C51973G9u.A0L(A0w);
        String str2 = this.A00;
        HNO hno2 = HNO.A0R;
        long A0H2 = C51970G9q.A0H();
        AnonymousClass90N r26 = AnonymousClass90N.TEXT_START;
        A0L.A00(new C53907GwD(A0X4, r26, hno2, str2, num4, 2, A0H2, A0H2));
        if (z) {
            2WX A0C = C51974G9v.A0C(AnonymousClass9JR.A00(C51973G9u.A0X(G9t.A0z(C51972G9s.A0S((2WX) null, 0, C51969G9p.A0F()), num2, C243573Zh.FLEX_END), num3, 32.0d, 0), AnonymousClass05K.A04, 0, C51970G9q.A0I()), C51965G9l.A0b(num3, 0.0f, 1), 0.0f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(I61.A00(A0L, HNO.A0u));
            gradientDrawable.setCornerRadius((float) C51972G9s.A0C(A0L, 20.0d));
            2WX A0Y2 = C51971G9r.A0Y(A0C, num2, gradientDrawable, 4);
            2Wb A0w2 = G9t.A0w(A0L);
            A0w2.A00(new C53907GwD((2WX) null, (AnonymousClass90N) null, HNO.A0Z, C244013aV.A0E(A0w2, 2131966408), AnonymousClass05K.A0j, 0, 248));
            C51967G9n.A1C(A0w2, A0L, A0Y2);
        }
        C51967G9n.A1E(A0L, A0w, A0y);
        if (!(!this.A01 || str == null || str.length() == 0)) {
            String A0F = C244013aV.A0F(A0w, str, 2131966331);
            2WX A0X5 = C51973G9u.A0X(G9t.A0y((2WX) null, num2, 0), num5, 6.0d, 0);
            2Wb A0w3 = G9t.A0w(A0w);
            A0w3.A00(new C53907GwD(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0N, 0, Double.doubleToRawLongBits(140.0d)), r26, HNO.A0i, A0F, num3, 1, A0J, A0J));
            if (htD != null && htD.A01) {
                long A0E2 = C51969G9p.A0E();
                A0w3.A00(new C53949Gwt(A003, ImageView.ScaleType.CENTER_CROP, C51972G9s.A0S(AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A0E2), num3, 0, A0E2), AnonymousClass05K.A0F, 0, Double.doubleToRawLongBits(3.0d)), 0, A0H2), 0, false));
            }
            A0w.A00(C243563Zg.A0G(A0w3, A0w, A0X5));
        }
        2Wb r0 = A0Q;
        r0.A00(C243563Zg.A02(A0w, A0Q, A0Y));
        return C243563Zg.A02(r0, r12, A0X);
    }
}
