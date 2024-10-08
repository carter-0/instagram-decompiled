package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;

/* renamed from: X.GrZ  reason: case insensitive filesystem */
public final class C53620GrZ extends C251343mx {
    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        AnonymousClass3Y5 r10 = r17;
        0qQ.A0B(r10, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        2V1 r3 = r10.A05;
        gradientDrawable.setColor(C51972G9s.A0A(r3.A0C, r10, R.attr.igds_color_pill_background));
        gradientDrawable.setCornerRadius(100.0f);
        C243573Zh r12 = C243573Zh.CENTER;
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A00 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A04, 0, C244013aV.A05(r10));
        Integer num = AnonymousClass05K.A00;
        2WX A10 = G9t.A10(A00, num, gradientDrawable);
        2Wb A0S = AnonymousClass7TG.A0S(r3);
        String A0E = C244013aV.A0E(A0S, 2131969490);
        2V1 r4 = A0S.A00;
        Context context = r4.A0C;
        int A07 = C51968G9o.A07(context, A0S);
        long A08 = C244013aV.A08(A0S);
        Typeface A03 = 0oh.A03(context, Typeface.DEFAULT, num);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r4, (2V5) null, A0E, 0);
        C51973G9u.A17(A0S, A0b, A07, A08);
        A0b.A0R(0);
        G9w.A12(A03, A0S, A0b, A0D);
        C51974G9v.A19(A0b, num, false);
        A0b.A0M(1);
        A0b.A0b(true);
        G9t.A1N(A0b, false);
        C51967G9n.A1G(A0S, A0b);
        return C243563Zg.A06(A0S, r10, A10, r12, (C243573Zh) null, (C243583Zi) null, false);
    }
}
