package X;

import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Gs7  reason: case insensitive filesystem */
public final class C53654Gs7 extends C251343mx {
    public final C242903Wq A00;
    public final C62320sa A01;

    public C53654Gs7(C242903Wq r2, C62320sa r3) {
        0qQ.A0B(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r34) {
        AnonymousClass3Y5 r32 = r34;
        0qQ.A0B(r32, 0);
        AnonymousClass9IZ r8 = (AnonymousClass9IZ) this.A01.invoke();
        if (r8 == null) {
            return null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        long A06 = C244013aV.A06(r32);
        long A0E = C51969G9p.A0E();
        2WX A0G = C51974G9v.A0G((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0u, 0, A06), 0, C244013aV.A0A(r32));
        Integer num = AnonymousClass05K.A1F;
        2WX A002 = AnonymousClass9JR.A00(A0G, num, 0, A0E);
        2Wb A0Q = C51972G9s.A0Q(r32);
        C243573Zh r27 = C243573Zh.CENTER;
        2V1 Aqq = A0Q.Aqq();
        2Wb A0S = AnonymousClass7TG.A0S(Aqq);
        C58179Inj inj = new C58179Inj(r8, 12);
        2V1 Aqq2 = A0S.Aqq();
        int A062 = C51968G9o.A06(Aqq2.A0C, A0S);
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X = C51971G9r.A0X((2WX) null, num2, 0.0f, 1);
        Integer num3 = AnonymousClass05K.A0C;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(AnonymousClass9JR.A00(C51971G9r.A0X(A0X, num3, 1.0f, 1), AnonymousClass05K.A05, 0, C244013aV.A0A(A0S)), num2, true, 4), num, new C59100J6i(inj, 0), 4);
        long A0G2 = C51972G9s.A0G(14.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num4 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(Aqq2, (2V5) null, (CharSequence) r8.A03, 0);
        C51973G9u.A17(A0S, A0b, A062, A0G2);
        A0b.A0R(0);
        G9w.A12(typeface, A0S, A0b, A0D);
        A0b.A0W(num4);
        C51973G9u.A1A(A0b, num4, 1.0f, false);
        A0b.A0M(2);
        C51969G9p.A1I(A0b);
        A0b.A0D();
        G9t.A1M(A0S, A0Y, A0b);
        2WX A0S2 = C51973G9u.A0S((2WX) null, C51965G9l.A0b(num2, 1.0f, 1), num3, 0.0f, 1);
        2Wb A0w = G9t.A0w(A0S);
        boolean z = r8.A01;
        C58179Inj inj2 = new C58179Inj(r8, 13);
        int A012 = C244013aV.A01(A0w, R.attr.glyphColorPrimary);
        Integer num5 = num;
        A0w.A00(new C249263jP(ImageView.ScaleType.FIT_CENTER, C51971G9r.A0Z(C51971G9r.A0Y(C51973G9u.A0Y(C51973G9u.A0U(C51971G9r.A0Y(C52112GFg.A01(AnonymousClass9JR.A00(C51973G9u.A0W(C51973G9u.A0W((2WX) null, A0w, num4, R.dimen.add_account_icon_circle_radius, 0), A0w, num2, R.dimen.add_account_icon_circle_radius, 0), AnonymousClass05K.A06, 0, C244013aV.A0A(A0w)), C51970G9q.A00(z ? 1 : 0)), AnonymousClass05K.A0D, Integer.valueOf(R.id.post_dismiss_button), 4), A0w, 2131960862), AnonymousClass05K.A0F, z), num5, new J6K(inj2, 49), 4), num4, J6S.A00(A0w, this, 39), "getDismissButton"), (Integer) null, R.drawable.instagram_x_pano_filled_24, A012));
        A0S.A00(C243563Zg.A0C(A0w, A0S, A0S2));
        A0Q.A00(new 2Tp((C243573Zh) null, r27, (C243583Zi) null, (C244343b2) null, A0S.A01, false));
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num2, 0, 9221401712017801217L);
        long A0A = C244013aV.A0A(A0Q);
        2Wb r02 = A0Q;
        return C51967G9n.A0N(C243563Zg.A0L(r02, G9t.A10(C51973G9u.A0R(A003, C51966G9m.A0k(0, A0A), 0, C51970G9q.A0I()), num4, C51965G9l.A0Y(C51968G9o.A08(Aqq.A0C, A0Q, R.attr.igds_color_elevated_separator)))), r02, r32, A002);
    }
}
