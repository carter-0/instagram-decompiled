package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.instagram.android.R;

public final class GGD extends C251343mx {
    public final GFT A00;
    public final long A01;
    public final C52058GDe A02;
    public final 1Av A03;
    public final boolean A04;

    public GGD(C52058GDe gDe, 1Av r3, GFT gft, long j, boolean z) {
        0qQ.A0B(gft, 1);
        this.A00 = gft;
        this.A02 = gDe;
        this.A01 = j;
        this.A04 = z;
        this.A03 = r3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r12) {
        0qQ.A0B(r12, 0);
        C52058GDe gDe = this.A02;
        if (gDe.A0S) {
            return new C53717Gt8(this.A03, this.A01, this.A04);
        } else if (!gDe.A0R) {
            return null;
        } else {
            AnonymousClass2S0.A01.A03();
            Drawable A0D = C244013aV.A0D(r12, R.drawable.instagram_fill_outline_44);
            DbX.A11(C243803a8.A00(r12), A0D, 2Yu.A0H(C243803a8.A00(r12), R.attr.igds_color_icon_on_media));
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            AnonymousClass7TE.A1N(C243803a8.A00(r12), paint, 2Yu.A0H(C243803a8.A00(r12), R.attr.igds_color_secondary_button_on_media));
            AnonymousClass7TE.A1Q(paint);
            paint.setAntiAlias(true);
            AnonymousClass3XV r0 = 2WX.A02;
            Integer num = AnonymousClass05K.A00;
            2WX A0U = C51973G9u.A0U(C51971G9r.A0Y(C51971G9r.A0Y(C51971G9r.A0X((2WX) null, num, 100.0f, 0), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), num, C243573Zh.FLEX_END, 3), r12, 2131955477);
            2Wb A0Q = C51972G9s.A0Q(r12);
            2WX A0Y = C51971G9r.A0Y(C51974G9v.A0I((2WX) null, C51970G9q.A0c(A0Q, num, R.dimen.abc_dropdownitem_icon_width, 0), A0Q, R.dimen.abc_dropdownitem_icon_width), num, C243573Zh.CENTER, 3);
            long A0C = C244013aV.A0C(A0Q, R.dimen.ai_agent_share_profile_sticker_padding);
            C51974G9v.A0h(A0D, A0Q.A00, A0Q, C51972G9s.A0V(C51971G9r.A0Y(C51974G9v.A0F(A0Y, C51967G9n.A0T(0, A0C), 0, C244013aV.A0C(A0Q, R.dimen.ai_agent_share_profile_sticker_padding)), num, shapeDrawable, 4), J6N.A00(this, 6)));
            return C243563Zg.A0C(A0Q, r12, A0U);
        }
    }
}
