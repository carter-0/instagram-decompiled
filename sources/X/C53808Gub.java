package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gub  reason: case insensitive filesystem */
public final class C53808Gub extends C251343mx {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final int A02 = R.dimen.abc_dropdownitem_icon_width;
    public final int A03 = R.dimen.action_bar_item_spacing_right;
    public final 2WX A04;
    public final JN9 A05;

    public final C251263mp A0X(AnonymousClass3Y5 r21) {
        AnonymousClass3Y5 r19 = r21;
        0qQ.A0B(r19, 0);
        JN9 jn9 = this.A05;
        if (jn9 instanceof C57663IeS) {
            return null;
        }
        if (jn9 instanceof C53586Gr1) {
            Context A002 = C243803a8.A00(r19);
            UserSession userSession = this.A01;
            C53586Gr1 gr1 = (C53586Gr1) jn9;
            List list = gr1.A01;
            UserSession userSession2 = userSession;
            SpannableStringBuilder A003 = AnonymousClass4i2.A00(A002, userSession2, (C253023q5) null, (String) null, C51970G9q.A0l(list), list.size(), r19.Bnf().A01(R.attr.igds_color_primary_text_on_media), AnonymousClass4i2.A03(userSession, C51970G9q.A0l(list), 2), true, true).A00();
            0qQ.A07(A003);
            2WX r17 = this.A04;
            2Wb A0Q = C51972G9s.A0Q(r19);
            Drawable A07 = 0Pl.A0n.A00(C243803a8.A00(r19), userSession).A07(C243803a8.A00(r19), gr1.A00, this.A00.getModuleName());
            AnonymousClass3XV r1 = 2WX.A02;
            int i = this.A02;
            long A0C = C244013aV.A0C(A0Q, i);
            Integer num = AnonymousClass05K.A00;
            2WX A0X = C51971G9r.A0X(AnonymousClass9JR.A00(C51974G9v.A0I((2WX) null, C51965G9l.A0c(num, 0, A0C), A0Q, i), AnonymousClass05K.A09, 0, C244013aV.A09(A0Q)), AnonymousClass05K.A0C, 0.0f, 1);
            2V1 r13 = A0Q.A00;
            C51974G9v.A0h(A07, r13, A0Q, A0X);
            Typeface A032 = 0oh.A03(C243803a8.A00(A0Q), Typeface.DEFAULT, num);
            int A08 = C51968G9o.A08(r13.A0C, A0Q, R.attr.igds_color_primary_text_on_media);
            long A0C2 = C244013aV.A0C(A0Q, this.A03);
            int A022 = A0Q.Bnf().A02(R.color.black_30_transparent);
            long A0C3 = C244013aV.A0C(A0Q, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r13, (2V5) null, A003, 0);
            C51973G9u.A17(A0Q, A0b, A08, A0C2);
            G9w.A1F(A0Q, A0b, 2Wd.A00(G9t.A15(A032, A0Q, A0b, 0, A022), A0C3), A0D);
            C51974G9v.A19(A0b, num, false);
            A0b.A0M(2);
            C51974G9v.A0y(A0Q, A0b, false);
            return C243563Zg.A0G(A0Q, r19, r17);
        }
        throw AnonymousClass7TE.A1K();
    }

    public C53808Gub(2WX r3, AnonymousClass0iw r4, UserSession userSession, JN9 jn9) {
        AnonymousClass7TG.A1O(r4, jn9);
        this.A00 = r4;
        this.A05 = jn9;
        this.A04 = r3;
        this.A01 = userSession;
    }
}
