package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.Gur  reason: case insensitive filesystem */
public final class C53824Gur extends C251343mx {
    public final C62320sa A00;
    public final float A01;
    public final int A02;
    public final Drawable A03;
    public final C243573Zh A04;
    public final CharSequence A05;
    public final boolean A06;

    public final C251263mp A0X(AnonymousClass3Y5 r24) {
        C243583Zi r8;
        AnonymousClass3Y5 r14 = r24;
        0qQ.A0B(r14, 0);
        TypedValue typedValue = new TypedValue();
        2V1 r4 = r14.A05;
        r4.A0C.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        2WX r12 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0X = C51965G9l.A0X((2WX) null, C51968G9o.A0c(num, 0));
        float f = this.A01;
        Integer num2 = AnonymousClass05K.A00;
        2WX A0V = C51972G9s.A0V(C51971G9r.A0Y(G9t.A0z(C51971G9r.A0X(A0X, num2, f, 0), num2, C243573Zh.FLEX_START), num, true, 4), J6F.A00(this, 49));
        boolean z = this.A06;
        if (z) {
            r8 = C243583Zi.FLEX_END;
        } else {
            r8 = C243583Zi.CENTER;
        }
        C243573Zh r22 = this.A04;
        2Wb A0S = AnonymousClass7TG.A0S(r4);
        if (z) {
            r12 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0A, 0, C244013aV.A0C(A0S, R.dimen.account_recs_header_image_margin));
        }
        2Wb A0w = G9t.A0w(A0S);
        Drawable drawable = this.A03;
        if (drawable != null) {
            2WX A0V2 = C51973G9u.A0V(C51973G9u.A0V(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0D, 0, C244013aV.A0A(A0w)), A0w, num2, 0), A0w, num, 0);
            Drawable mutate = drawable.mutate();
            2V1 Aqq = A0w.Aqq();
            DbX.A11(Aqq.A0C, mutate, R.color.canvas_bottom_sheet_description_text_color);
            C51974G9v.A0h(mutate, Aqq, A0w, A0V2);
        }
        2V1 r15 = A0w.A00;
        int A08 = C51968G9o.A08(r15.A0C, A0w, R.attr.igds_color_shadow_on_media);
        long A0G = C51969G9p.A0G((int) typedValue.getFloat());
        Typeface create = Typeface.create("sans-serif-medium", 0);
        CharSequence charSequence = this.A05;
        long A082 = C244013aV.A08(A0w);
        int A022 = A0w.Bnf().A02(R.color.canvas_bottom_sheet_description_text_color);
        int i = this.A02;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, charSequence, 0);
        C51973G9u.A17(A0w, A0b, A022, A082);
        G9w.A1F(A0w, A0b, 2Wd.A00(G9t.A15(create, A0w, A0b, 0, A08), A0G), A0D);
        C51974G9v.A17(A0b, num2, false);
        A0b.A0M(i);
        C51969G9p.A1I(A0b);
        A0b.A05((AnonymousClass2VW) null);
        C51967G9n.A1G(A0w, A0b);
        C51967G9n.A1C(A0w, A0S, r12);
        return C243563Zg.A07(A0S, r14, A0V, r22, r8);
    }

    public C53824Gur(Drawable drawable, C243573Zh r2, CharSequence charSequence, C62320sa r4, float f, int i, boolean z) {
        this.A05 = charSequence;
        this.A03 = drawable;
        this.A04 = r2;
        this.A06 = z;
        this.A01 = f;
        this.A02 = i;
        this.A00 = r4;
    }
}
