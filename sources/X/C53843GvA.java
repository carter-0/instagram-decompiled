package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GvA  reason: case insensitive filesystem */
public final class C53843GvA extends C251343mx {
    public final C267324bN A00;
    public final Integer A01;
    public final 0sP A02;
    public final 0sP A03;
    public final Drawable A04;
    public final UserSession A05;
    public final CharSequence A06;
    public final Integer A07;
    public final boolean A08;

    public C53843GvA(Drawable drawable, C267324bN r3, UserSession userSession, CharSequence charSequence, Integer num, Integer num2, 0sP r8, 0sP r9, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A06 = charSequence;
        this.A00 = r3;
        this.A08 = z;
        this.A07 = num;
        this.A04 = drawable;
        this.A01 = num2;
        this.A02 = r8;
        this.A03 = r9;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        C247373gE r12;
        int i;
        AnonymousClass3Y5 r6 = r27;
        0qQ.A0B(r6, 0);
        Integer num = this.A07;
        if (num != null) {
            AnonymousClass3XV r0 = 2WX.A02;
            2WX A002 = AnonymousClass9JR.A00(C51971G9r.A0X(C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, C51970G9q.A0I()), AnonymousClass05K.A0C, 0.0f, 1), AnonymousClass05K.A09, 0, C51970G9q.A0H());
            Drawable A0K = C51968G9o.A0K(r6, num.intValue());
            C51973G9u.A0x(A0K, r6, R.color.canvas_bottom_sheet_description_text_color);
            Drawable mutate = A0K.mutate();
            if (this.A08) {
                AnonymousClass7TE.A1R(mutate, 2Yu.A0H(r6.A05.A0C, R.attr.igds_color_clips_tab_inverted_background));
            }
            0qQ.A07(mutate);
            r12 = C51974G9v.A0P(mutate, r6.A05, A002);
        } else {
            Drawable drawable = this.A04;
            if (drawable != null) {
                AnonymousClass3XV r02 = 2WX.A02;
                r12 = C51974G9v.A0P(drawable, r6.A05, AnonymousClass9JR.A00(C51971G9r.A0X(C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, C51969G9p.A0F()), AnonymousClass05K.A0C, 0.0f, 1), AnonymousClass05K.A09, 0, C51970G9q.A0H()));
            } else {
                r12 = null;
            }
        }
        2V1 r11 = r6.A05;
        Context A0B = C51965G9l.A0B(r11);
        boolean A012 = C52180GHw.A01(A0B, this.A05);
        2WX r19 = 2WX.A02;
        Integer num2 = AnonymousClass05K.A01;
        2WX A0U = C51972G9s.A0U((2WX) null, num2, 0);
        C243533Zd r10 = C243533Zd.LOCAL;
        2WX A0V = C51971G9r.A0V(r11, A0U, r10, "effect_cta");
        long A082 = C244013aV.A08(r6);
        if (!A012) {
            num2 = AnonymousClass05K.A00;
        }
        Integer num3 = AnonymousClass05K.A00;
        Typeface A032 = 0oh.A03(A0B, Typeface.DEFAULT, num3);
        Context A003 = C243803a8.A00(r6);
        boolean z = this.A08;
        boolean z2 = z;
        Context A004 = C243803a8.A00(r6);
        if (z) {
            i = R.attr.igds_color_text_on_white;
        } else {
            i = R.attr.igds_color_text_on_color;
        }
        int color = A003.getColor(2Yu.A0H(A004, i));
        CharSequence charSequence = this.A06;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r11, (2V5) null, charSequence, 0);
        C51973G9u.A16(r6, A0b, color, A082);
        A0b.A0R(0);
        G9w.A11(A032, r6, A0b, A0D);
        C51974G9v.A16(A0b, num3, num2);
        A0b.A0M(1);
        A0b.A0b(false);
        G9t.A1N(A0b, false);
        2WW A0R = C51967G9n.A0R(A0V, A0b);
        2WX A013 = C52199GIq.A01(r6, (Integer) null, z2, true, A012, false);
        AnonymousClass9JR A0c = C51965G9l.A0c(AnonymousClass05K.A0A, 0, C51970G9q.A0D());
        if (A013 == r19) {
            A013 = null;
        }
        2WX A0V2 = C51971G9r.A0V(r11, C51971G9r.A0Z(C51971G9r.A0Y(C51971G9r.A0Y(C51965G9l.A0X(A013, A0c), AnonymousClass05K.A1F, J6N.A00(this, 28), 4), AnonymousClass05K.A04, J6N.A00(this, 29), 4), AnonymousClass05K.A0Y, J6R.A00(this, r6, 30), (String) null), r10, "row_effect_cta");
        Integer num4 = this.A01;
        if (num4 != null) {
            A0V2 = C51971G9r.A0Z(C51971G9r.A0Y(A0V2, AnonymousClass05K.A0D, num4, 4), num3, J6R.A00(this, r6, 31), (String) null);
        }
        2Wb A0S = AnonymousClass7TG.A0S(r11);
        if (r12 != null) {
            A0S.A00(r12);
        }
        return C51967G9n.A0P(A0R, A0S, r6, A0V2);
    }
}
