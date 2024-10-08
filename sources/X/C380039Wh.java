package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Wh  reason: invalid class name and case insensitive filesystem */
public final class C380039Wh extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final RectF A0E = AnonymousClass7TE.A0Y();
    public final RectF A0F = AnonymousClass7TE.A0Y();
    public final Drawable A0G;
    public final C306386Ly A0H;

    public C380039Wh(Context context, UserSession userSession) {
        Resources resources = context.getResources();
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A02 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A0A = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A09 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        this.A04 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A01 = resources.getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
        this.A07 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top);
        this.A06 = AnonymousClass7TE.A0D(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A0D = A0V;
        AnonymousClass7TE.A1N(context, A0V, R.color.canvas_bottom_sheet_description_text_color);
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A0C = A0V2;
        AnonymousClass7TE.A1N(context, A0V2, R.color.chat_sticker_button_divider_color);
        float f = (float) dimensionPixelSize;
        A0V2.setStrokeWidth(f);
        A0V2.setStyle(Paint.Style.STROKE);
        Paint A0V3 = AnonymousClass7TE.A0V(1);
        this.A0B = A0V3;
        AnonymousClass7TE.A1N(context, A0V3, 2Yu.A0H(context, R.attr.igds_color_creation_tools_green));
        A0V3.setStrokeWidth(f);
        A0V3.setStyle(Paint.Style.FILL_AND_STROKE);
        int A0G2 = AnonymousClass7TE.A0G(resources);
        C306386Ly A0s = AnonymousClass7TE.A0s(context, (this.A02 * 2) + this.A01);
        this.A0H = A0s;
        AnonymousClass7TE.A1P(resources, A0s, 2131971252);
        AnonymousClass7TG.A0y(context, A0s, R.attr.igds_color_creation_tools_green);
        A0s.A0K(Layout.Alignment.ALIGN_CENTER);
        A0s.A0b.setLetterSpacing(0.0625f);
        A0s.A0R();
        AJB.A05(context, userSession, A0s, (float) A0G2, 0.0f, 0.0f);
        Drawable drawable = context.getDrawable(R.drawable.circle_check_filled_8);
        if (drawable != null) {
            this.A0G = drawable;
            AnonymousClass7TE.A1R(drawable.mutate(), AnonymousClass7TE.A09(context));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void draw(Canvas canvas) {
        int i;
        Paint paint;
        0qQ.A0B(canvas, 0);
        if (this.A00) {
            i = (int) (AnonymousClass7TG.A0I() % 4);
        } else {
            i = 0;
        }
        RectF rectF = this.A0F;
        float f = (float) this.A08;
        canvas.drawRoundRect(rectF, f, f, this.A0D);
        this.A0H.draw(canvas);
        canvas.save();
        for (int i2 = 0; i2 < 3; i2++) {
            RectF rectF2 = this.A0E;
            float f2 = (float) this.A03;
            if (i2 == i || (i == 3 && i2 == 1)) {
                paint = this.A0B;
            } else {
                paint = this.A0C;
            }
            canvas.drawRoundRect(rectF2, f2, f2, paint);
            this.A0G.draw(canvas);
            canvas.translate(0.0f, (float) (this.A04 + this.A07));
        }
        canvas.restore();
        if (this.A00) {
            invalidateSelf();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A0A + this.A0H.A06 + this.A09 + ((this.A07 + this.A04) * 3) + this.A02;
    }

    public final int getIntrinsicWidth() {
        return (this.A02 * 2) + this.A01;
    }

    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A0H.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        int i6 = this.A02;
        int i7 = this.A01;
        float f2 = (float) ((i6 * 2) + i7);
        float intrinsicHeight = (float) getIntrinsicHeight();
        float f3 = f - (f2 / 2.0f);
        float f4 = (((float) (i2 + i4)) / 2.0f) - (intrinsicHeight / 2.0f);
        C306386Ly r6 = this.A0H;
        float f5 = (float) r6.A0A;
        int i8 = this.A0A;
        float f6 = (float) (i8 + r6.A06 + this.A09);
        float descent = r6.A0b.descent();
        this.A0F.set(f3, f4, f2 + f3, intrinsicHeight + f4);
        float f7 = ((float) i6) + f3;
        float f8 = ((float) this.A07) + f6 + f4;
        this.A0E.set(f7, f8, f7 + ((float) i7), ((float) this.A04) + f8);
        Drawable drawable = this.A0G;
        float f9 = (float) this.A05;
        float f10 = f7 + f9;
        float f11 = f9 + f8;
        float f12 = (float) this.A06;
        drawable.setBounds((int) f10, (int) f11, (int) (f10 + f12), (int) (f11 + f12));
        float f13 = f5 / 2.0f;
        float f14 = descent / 2.0f;
        r6.setBounds((int) (f - f13), (int) (((float) i8) + f4 + f14), (int) (f + f13), (int) ((f4 + f6) - f14));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        this.A0C.setColorFilter(colorFilter);
        this.A0B.setColorFilter(colorFilter);
        this.A0H.setColorFilter(colorFilter);
    }
}
