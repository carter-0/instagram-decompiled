package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.instagram.android.R;

/* renamed from: X.Gt8  reason: case insensitive filesystem */
public final class C53717Gt8 extends C251343mx {
    public final long A00;
    public final 1Av A01;
    public final boolean A02;

    public C53717Gt8(1Av r2, long j, boolean z) {
        0qQ.A0B(r2, 3);
        this.A00 = j;
        this.A02 = z;
        this.A01 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r22) {
        2WW r0;
        AnonymousClass3Y5 r9 = r22;
        0qQ.A0B(r9, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        AnonymousClass7TE.A1N(C243803a8.A00(r9), paint, 2Yu.A0H(C243803a8.A00(r9), R.attr.igds_color_separator_or_stroke_on_media));
        AnonymousClass7TE.A1Q(paint);
        C243673Zt A002 = C243633Zp.A00(r9, C58618Iup.A00);
        2Wa A003 = C243643Zq.A00(r9, C58617Iuo.A00);
        C60340gF r5 = C60340gF.A00;
        C243773a4.A00(r9, C58697Iw6.A00(A003, A002, this, 41), new Object[]{r5});
        C243673Zt A004 = C243633Zp.A00(r9, C58615Ium.A00);
        2Wa A005 = C243643Zq.A00(r9, C58616Iun.A00);
        C58693Iw2.A00(r9, A005, A004, new Object[]{r5}, 37);
        AnonymousClass3XV r1 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(C51965G9l.A0X((2WX) null, C51968G9o.A0c(num, 0)), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), num, C243573Zh.FLEX_END, 3);
        2Wb A0Q = C51972G9s.A0Q(r9);
        if (this.A02) {
            String A0E = C244013aV.A0E(A0Q, 2131955478);
            long A07 = C244013aV.A07(A0Q);
            2V1 r13 = A0Q.A00;
            int A0C = C51971G9r.A0C(r13, A0Q);
            long A0C2 = C244013aV.A0C(A0Q, R.dimen.font_large);
            2WX A0Z = C51971G9r.A0Z(AnonymousClass9JR.A00(C52112GFg.A00(A005, r1), AnonymousClass05K.A0A, 0, C244013aV.A0C(A0Q, R.dimen.ad4ad_button_left_right_margin)), num, J6N.A00(this, 7), (String) null);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r13, (2V5) null, A0E, 0);
            C51973G9u.A17(A0Q, A0b, A0C, A0C2);
            A0b.A0R(0);
            A0b.A0S(typeface);
            A0b.A0F();
            G9w.A1F(A0Q, A0b, C51968G9o.A09(A0Q, A07), A0D);
            C51974G9v.A17(A0b, num, false);
            A0b.A0M(1);
            C51973G9u.A19(A0Z, A0b, false);
            r0 = A0b.A0A();
        } else {
            r0 = null;
        }
        A0Q.A00(r0);
        C51974G9v.A0h(shapeDrawable, A0Q.A00, A0Q, C52112GFg.A01(C51974G9v.A0K(C51971G9r.A0X((2WX) null, num, AnonymousClass7TE.A04(A003.A03), 0), C51965G9l.A0c(AnonymousClass05K.A01, 0, C244013aV.A07(A0Q)), num), 0.4f));
        return C243563Zg.A04(A0Q, r9, A0Y);
    }
}
