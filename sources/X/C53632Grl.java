package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Grl  reason: case insensitive filesystem */
public final class C53632Grl extends C251343mx {
    public final C52971GgO A00;

    public final C251263mp A0X(AnonymousClass3Y5 r25) {
        AnonymousClass3Y5 r10 = r25;
        0qQ.A0B(r10, 0);
        2V1 r3 = r10.A05;
        Context context = r3.A0C;
        Integer num = AnonymousClass05K.A01;
        Typeface A03 = 0oh.A03(context, Typeface.DEFAULT, num);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A15, 0, C51969G9p.A0E());
        2Wb A0S = AnonymousClass7TG.A0S(r3);
        long A0E = C51970G9q.A0E();
        long A0I = C51970G9q.A0I();
        Integer num2 = AnonymousClass05K.A05;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num2, 0, A0I);
        Integer num3 = AnonymousClass05K.A0u;
        A0S.A00(new C249263jP(ImageView.ScaleType.CENTER, AnonymousClass9JR.A00(A003, num3, 0, A0E), (Integer) null, R.drawable.instagram_chevron_left_outline_12, C244013aV.A01(A0S, R.attr.glyphColorSecondary)));
        2WX A0Z = C51973G9u.A0Z(C51972G9s.A0U(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A0I), num3, 0, C51970G9q.A0H()), num, 0), new J6I(this, 7));
        String A0E2 = C244013aV.A0E(A0S, 2131976609);
        long A0G = C51972G9s.A0G(12.0f);
        2V1 r14 = A0S.A00;
        int A07 = C51968G9o.A07(r14.A0C, A0S);
        long A072 = C244013aV.A07(A0S);
        Integer num4 = AnonymousClass05K.A0N;
        long A0D = C51969G9p.A0D();
        Integer num5 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r14, (2V5) null, A0E2, 0);
        C51973G9u.A17(A0S, A0b, A07, A0G);
        A0b.A0R(1);
        G9w.A12(A03, A0S, A0b, A0D);
        A0b.A0W(num4);
        C51974G9v.A18(A0b, num5, false);
        A0b.A0M(1);
        A0b.A01.A00 = (float) C51968G9o.A09(A0S, A072);
        C51969G9p.A1I(A0b);
        G9t.A1M(A0S, A0Z, A0b);
        return C243563Zg.A0B(A0S, r10, A002);
    }

    public C53632Grl(C52971GgO ggO) {
        this.A00 = ggO;
    }
}
