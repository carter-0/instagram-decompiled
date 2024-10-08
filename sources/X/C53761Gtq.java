package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

/* renamed from: X.Gtq  reason: case insensitive filesystem */
public final class C53761Gtq extends C251343mx {
    public final int A00 = R.dimen.action_bar_item_spacing_right;
    public final C62320sa A01;
    public final AnonymousClass0iw A02;
    public final JNB A03;

    public final C251263mp A0X(AnonymousClass3Y5 r37) {
        Drawable A002;
        AnonymousClass3Y5 r35 = r37;
        0qQ.A0B(r35, 0);
        JNB jnb = this.A03;
        if (jnb instanceof C57665IeU) {
            return null;
        }
        if (jnb instanceof C53588Gr3) {
            AnonymousClass3XV r1 = 2WX.A02;
            2WX A003 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0E, 0, C244013aV.A03(r35));
            2Wb A0Q = C51972G9s.A0Q(r35);
            int A09 = C51968G9o.A09(A0Q, C244013aV.A06(A0Q));
            C53588Gr3 gr3 = (C53588Gr3) jnb;
            ImageUrl imageUrl = gr3.A00;
            AnonymousClass0iw r11 = this.A02;
            float f = (float) A09;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            int A06 = C51973G9u.A06(A0Q);
            2V1 r12 = A0Q.A00;
            2V1 r34 = r12;
            2Ts r2 = new 2Ts();
            AnonymousClass2V4 r4 = r12.A0D;
            C244143ai r3 = C244143ai.ALL;
            if (r4 != null) {
                r2.A01(r3, r4.A00(0.5f));
                Arrays.fill(r2.A00, 0, 4, f);
                Context context = r34.A0C;
                Context context2 = context;
                r2.A00(r3, C51968G9o.A08(context, A0Q, R.attr.igds_color_photo_border));
                Integer num = AnonymousClass05K.A01;
                2WX A0z = G9t.A0z((2WX) null, num, r2);
                long A0C = C244013aV.A0C(A0Q, R.dimen.appreciation_reels_grid_item_width);
                Integer num2 = AnonymousClass05K.A00;
                2WX A0W = C51973G9u.A0W(AnonymousClass9JR.A00(A0z, num2, 0, A0C), A0Q, num, R.dimen.appreciation_reels_grid_item_width, 0);
                J6P A004 = J6P.A00(this, 49);
                Integer num3 = AnonymousClass05K.A1F;
                A0Q.A00(new C53984GxS(scaleType, C51971G9r.A0Y(A0W, num3, A004, 4), r11, imageUrl, f, A06, 0, false, false));
                String str = gr3.A02;
                boolean z = gr3.A03;
                C243573Zh r20 = C243573Zh.FLEX_START;
                long A062 = C244013aV.A06(A0Q);
                Integer num4 = AnonymousClass05K.A08;
                2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00((2WX) null, num4, 0, A062), num3, J6P.A00(this, 48), 4);
                2Wb A0L = C51973G9u.A0L(A0Q);
                long A0C2 = C244013aV.A0C(A0L, R.dimen.accent_edge_thickness);
                2WX A005 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A05, 0, A0C2), AnonymousClass05K.A03, 0, C244013aV.A05(A0L));
                2Wb A0L2 = C51973G9u.A0L(A0L);
                Context A006 = C243803a8.A00(A0L2);
                if (z) {
                    A002 = C263314Kg.A00(A006, num2, R.drawable.instagram_music_pano_filled_12);
                } else {
                    A002 = C263314Kg.A00(A006, num2, R.drawable.clips_trending_arrow);
                }
                C51971G9r.A1C(new GH5(A002, ImageView.ScaleType.CENTER_INSIDE, (2WX) null, false), A0L2, A0L, A005);
                int i = this.A00;
                long A0C3 = C244013aV.A0C(A0L, i);
                2V1 r122 = A0L.A00;
                int A0C4 = C51971G9r.A0C(r122, A0L);
                Typeface typeface = Typeface.DEFAULT;
                long A0D = C51969G9p.A0D();
                C244103ae A0b = C51971G9r.A0b(r122, (2V5) null, str, R.style.igds_emphasized_body_1);
                C51973G9u.A17(A0L, A0b, A0C4, A0C3);
                A0b.A0R(1);
                G9w.A12(typeface, A0L, A0b, A0D);
                C51970G9q.A1J(A0b, num2);
                C51970G9q.A1I(A0b, 1.28f, false);
                A0b.A0E();
                C51974G9v.A0y(A0L, A0b, false);
                A0Q.A00(C243563Zg.A0I(A0L, A0Q, A0Y, r20, (C243583Zi) null));
                String str2 = gr3.A01;
                Integer num5 = num3;
                2WX A0Y2 = C51971G9r.A0Y(AnonymousClass9JR.A00((2WX) null, num4, 0, C244013aV.A07(A0Q)), num5, new J6L(this, 0), 4);
                int A08 = C51968G9o.A08(context2, A0Q, R.attr.igds_color_secondary_text_on_media);
                long A0C5 = C244013aV.A0C(A0Q, i);
                C244103ae A0b2 = C51971G9r.A0b(r34, (2V5) null, str2, R.style.igds_body_1);
                C51973G9u.A17(A0Q, A0b2, A08, A0C5);
                A0b2.A0R(0);
                G9w.A12(typeface, A0Q, A0b2, A0D);
                A0b2.A0B();
                C51974G9v.A14(A0b2, num2, 1.28f, false, true);
                G9t.A1M(A0Q, A0Y2, A0b2);
                return C243563Zg.A05(A0Q, r35, A003);
            }
            throw AnonymousClass7TE.A0z("This builder has already been disposed / built!");
        }
        throw AnonymousClass7TE.A1K();
    }

    public C53761Gtq(AnonymousClass0iw r3, JNB jnb, C62320sa r5) {
        0qQ.A0B(r3, 1);
        this.A02 = r3;
        this.A03 = jnb;
        this.A01 = r5;
    }
}
