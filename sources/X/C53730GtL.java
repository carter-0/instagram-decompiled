package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.GtL  reason: case insensitive filesystem */
public final class C53730GtL extends C251343mx {
    public final C335907dj A00;
    public final C70804OLz A01;
    public final C55844HoR A02;
    public final AnonymousClass4DU A03;

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        AnonymousClass3Y5 r31 = r33;
        0qQ.A0B(r31, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        C55844HoR hoR = this.A02;
        gradientDrawable.setColor(hoR.A02);
        gradientDrawable.setCornerRadius((float) C51972G9s.A0B(r31, 64.0d));
        gradientDrawable.setStroke(C51972G9s.A0B(r31, 2.0d), hoR.A03);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(AnonymousClass05K.A0D, C66579MXk.A00(1062), 4));
        long A0H = C51970G9q.A0H();
        long doubleToRawLongBits = Double.doubleToRawLongBits(-8.0d);
        Integer num = AnonymousClass05K.A07;
        2WX A0H2 = C51974G9v.A0H(A0X, C51965G9l.A0c(num, 0, A0H), 0, doubleToRawLongBits);
        long A0D = C51970G9q.A0D();
        2WX A0Q = C51973G9u.A0Q(A0H2, C51967G9n.A0S(0, A0D), 0, C51969G9p.A0B());
        Integer num2 = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(A0Q, num2, gradientDrawable, 4), AnonymousClass05K.A0N, C244143ai.END, 3);
        C243573Zh r12 = C243573Zh.CENTER;
        2WX A0Y2 = C51971G9r.A0Y(A0Y, num2, r12, 3);
        2Wb A0Q2 = C51972G9s.A0Q(r31);
        2V1 r10 = A0Q2.A00;
        Context context = r10.A0C;
        Context context2 = context;
        int A06 = C51968G9o.A06(context, A0Q2);
        long A08 = C244013aV.A08(A0Q2);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r10, (2V5) null, "❤️", 0);
        C51973G9u.A17(A0Q2, A0b, A06, A08);
        A0b.A0R(0);
        G9w.A12(typeface, A0Q2, A0b, A0D2);
        C51974G9v.A19(A0b, num2, false);
        A0b.A0E();
        A0b.A0b(false);
        A0b.A0Y(false);
        A0b.A0Z(true);
        A0b.A05((AnonymousClass2VW) null);
        C51967G9n.A1G(A0Q2, A0b);
        C335907dj r11 = this.A00;
        if (r11.A0T) {
            SimpleImageUrl A0V = DbS.A0V(this.A01.A04);
            A0Q2.A00(new C244443bC(C51973G9u.A0T(C51974G9v.A0M((2WX) null, num2, 0, C51970G9q.A0E()), C51965G9l.A0c(num, 0, A0H), num2, r12, 3), this.A03, A0V, (AnonymousClass3NK) null, A0Q2.Bnf().A02(2Yu.A04(context2)), 0, -16777216, false, true, false));
        }
        String valueOf = String.valueOf(r11.A0G);
        int A062 = C51968G9o.A06(context2, A0Q2);
        long A082 = C244013aV.A08(A0Q2);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        2WX A0T = C51973G9u.A0T((2WX) null, C51965G9l.A0c(num, 0, A0H), num2, r12, 3);
        C244103ae A0b2 = C51971G9r.A0b(r10, (2V5) null, valueOf, 0);
        C51973G9u.A17(A0Q2, A0b2, A062, A082);
        A0b2.A0R(0);
        G9w.A12(create, A0Q2, A0b2, A0D2);
        C51974G9v.A19(A0b2, num2, false);
        A0b2.A0E();
        C51969G9p.A1I(A0b2);
        G9t.A1M(A0Q2, A0T, A0b2);
        return C243563Zg.A0B(A0Q2, r31, A0Y2);
    }

    public C53730GtL(C335907dj r1, C70804OLz oLz, C55844HoR hoR, AnonymousClass4DU r4) {
        C51974G9v.A1M(oLz, hoR, r4);
        this.A00 = r1;
        this.A01 = oLz;
        this.A02 = hoR;
        this.A03 = r4;
    }
}
