package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.GtG  reason: case insensitive filesystem */
public final class C53725GtG extends C251343mx {
    public final int A00 = R.dimen.account_discovery_bottom_gap;
    public final 2WX A01;
    public final JN8 A02;

    public final C251263mp A0X(AnonymousClass3Y5 r18) {
        AnonymousClass3Y5 r16 = r18;
        0qQ.A0B(r16, 0);
        JN8 jn8 = this.A02;
        if (jn8 instanceof C57662IeR) {
            return null;
        }
        if (jn8 instanceof C53584Gqz) {
            SpannableStringBuilder A0E = C51965G9l.A0E();
            C53584Gqz gqz = (C53584Gqz) jn8;
            String str = gqz.A00;
            if (!(str == null || str.length() == 0)) {
                A0E.append(str);
                String str2 = gqz.A01;
                if (!(str2 == null || str2.length() == 0)) {
                    A0E.append(" · ");
                }
            }
            String str3 = gqz.A01;
            if (!(str3 == null || str3.length() == 0)) {
                A0E.append(str3);
            }
            2WX r10 = this.A01;
            2Wb A0Q = C51972G9s.A0Q(r16);
            2V1 r13 = A0Q.A00;
            Context context = r13.A0C;
            Drawable drawable = context.getDrawable(R.drawable.instagram_music_pano_filled_12);
            if (drawable != null) {
                drawable.setTint(C51968G9o.A05(context, A0Q));
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
                AnonymousClass3XV r0 = 2WX.A02;
                C51969G9p.A13(drawable, scaleType, A0Q, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1F, 0, C244013aV.A05(A0Q)));
            }
            int A05 = C51968G9o.A05(context, A0Q);
            long A0C = C244013aV.A0C(A0Q, this.A00);
            int A022 = A0Q.Bnf().A02(R.color.black_30_transparent);
            long A0C2 = C244013aV.A0C(A0Q, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            Integer num = AnonymousClass05K.A00;
            C244103ae A0b = C51971G9r.A0b(r13, (2V5) null, A0E, 0);
            C51973G9u.A17(A0Q, A0b, A05, A0C);
            G9w.A1F(A0Q, A0b, 2Wd.A00(G9t.A15(typeface, A0Q, A0b, 0, A022), A0C2), A0D);
            C51974G9v.A19(A0b, num, false);
            A0b.A0M(1);
            C51974G9v.A0y(A0Q, A0b, false);
            return C243563Zg.A0G(A0Q, r16, r10);
        }
        throw AnonymousClass7TE.A1K();
    }

    public C53725GtG(2WX r3, JN8 jn8) {
        0qQ.A0B(jn8, 1);
        this.A02 = jn8;
        this.A01 = r3;
    }
}
