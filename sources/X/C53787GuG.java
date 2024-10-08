package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GuG  reason: case insensitive filesystem */
public final class C53787GuG extends C251343mx {
    public final int A00;
    public final int A01;
    public final 2WX A02;
    public final AnonymousClass0iw A03;
    public final JNE A04;

    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        AnonymousClass3Y5 r25 = r27;
        0qQ.A0B(r25, 0);
        JNE jne = this.A04;
        if (jne instanceof C57668IeX) {
            return null;
        }
        if (jne instanceof C53591Gr6) {
            C53591Gr6 gr6 = (C53591Gr6) jne;
            SpannableStringBuilder A0C = DbS.A0C(gr6.A01);
            if (gr6.A02) {
                C244273av.A08(C51967G9n.A09(r25), A0C, false);
            }
            2WX r24 = this.A02;
            2Wb A0Q = C51972G9s.A0Q(r25);
            AnonymousClass3XV r1 = 2WX.A02;
            int i = this.A00;
            long A0C2 = C244013aV.A0C(A0Q, i);
            Integer num = AnonymousClass05K.A00;
            2WX A002 = AnonymousClass9JR.A00(C51974G9v.A0I((2WX) null, C51965G9l.A0c(num, 0, A0C2), A0Q, i), AnonymousClass05K.A09, 0, C244013aV.A09(A0Q));
            ImageUrl imageUrl = gr6.A00;
            2V1 r8 = A0Q.A00;
            Context context = r8.A0C;
            int A022 = A0Q.Bnf().A02(2Yu.A04(context));
            int A08 = C51968G9o.A08(context, A0Q, R.attr.igds_color_photo_border);
            A0Q.A00(new C244443bC(A002, this.A03, imageUrl, (AnonymousClass3NK) null, A022, C51972G9s.A0D(A0Q, R.dimen.action_sheet_divider_margin_top), A08, false, true, false));
            int A05 = C51968G9o.A05(context, A0Q);
            long A0C3 = C244013aV.A0C(A0Q, this.A01);
            int A023 = A0Q.Bnf().A02(R.color.black_30_transparent);
            long A0C4 = C244013aV.A0C(A0Q, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r8, (2V5) null, A0C, 0);
            C51973G9u.A17(A0Q, A0b, A05, A0C3);
            G9w.A1F(A0Q, A0b, 2Wd.A00(G9t.A15(typeface, A0Q, A0b, 1, A023), A0C4), A0D);
            C51974G9v.A19(A0b, num, false);
            A0b.A0M(1);
            C51974G9v.A0y(A0Q, A0b, false);
            return C243563Zg.A0G(A0Q, r25, r24);
        }
        throw AnonymousClass7TE.A1K();
    }

    public C53787GuG(2WX r1, AnonymousClass0iw r2, JNE jne, int i, int i2) {
        AnonymousClass7TG.A1O(r2, jne);
        this.A03 = r2;
        this.A04 = jne;
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }
}
