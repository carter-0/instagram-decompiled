package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;

/* renamed from: X.GtH  reason: case insensitive filesystem */
public final class C53726GtH extends C251343mx {
    public final int A00 = R.dimen.action_bar_item_spacing_right;
    public final 2WX A01;
    public final JNA A02;

    public final C251263mp A0X(AnonymousClass3Y5 r18) {
        AnonymousClass3Y5 r16 = r18;
        0qQ.A0B(r16, 0);
        JNA jna = this.A02;
        if (jna instanceof C57664IeT) {
            return null;
        }
        if (jna instanceof C53587Gr2) {
            SpannableStringBuilder A0E = C51965G9l.A0E();
            String str = ((C53587Gr2) jna).A00;
            if (!(str == null || str.length() == 0)) {
                A0E.append(str);
            }
            2WX r10 = this.A01;
            2Wb A0Q = C51972G9s.A0Q(r16);
            2V1 r1 = A0Q.A00;
            int A0C = C51971G9r.A0C(r1, A0Q);
            long A0C2 = C244013aV.A0C(A0Q, this.A00);
            int A022 = A0Q.Bnf().A02(R.color.black_30_transparent);
            long A0C3 = C244013aV.A0C(A0Q, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            Integer num = AnonymousClass05K.A00;
            C244103ae A0b = C51971G9r.A0b(r1, (2V5) null, A0E, 0);
            C51973G9u.A17(A0Q, A0b, A0C, A0C2);
            G9w.A1F(A0Q, A0b, 2Wd.A00(G9t.A15(typeface, A0Q, A0b, 0, A022), A0C3), A0D);
            C51974G9v.A19(A0b, num, false);
            A0b.A0M(2);
            C51974G9v.A0y(A0Q, A0b, false);
            return C243563Zg.A0G(A0Q, r16, r10);
        }
        throw AnonymousClass7TE.A1K();
    }

    public C53726GtH(2WX r2, JNA jna) {
        this.A02 = jna;
        this.A01 = r2;
    }
}
