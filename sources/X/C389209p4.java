package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.instagram.android.R;

/* renamed from: X.9p4  reason: invalid class name and case insensitive filesystem */
public final class C389209p4 extends AnonymousClass3O7 {
    public static final float[] A0L = {1.0f, 1.21f, 1.11f, 0.82f};
    public float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final Paint A0D;
    public final RectF A0E = AnonymousClass7TE.A0Y();
    public final float A0F;
    public final float A0G;
    public final float A0H;
    public final float A0I;
    public final float A0J;
    public final float A0K;

    public C389209p4(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.A0D = paint;
        Resources resources = getResources();
        this.A0I = resources.getDimension(R.dimen.news_feed_placeholder_profile_radius);
        this.A0K = resources.getDimension(R.dimen.abc_control_corner_material);
        this.A03 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A02 = resources.getDimension(R.dimen.canvas_colour_wheel_offset_y);
        this.A01 = resources.getDimension(R.dimen.add_account_icon_circle_radius);
        this.A06 = resources.getDimension(R.dimen.alert_dialog_margin_horizontal);
        this.A0F = resources.getDimension(R.dimen.abc_button_inset_vertical_material);
        this.A0G = resources.getDimension(R.dimen.album_preview_add_item_margin);
        this.A04 = resources.getDimension(R.dimen.fb_polling_background_corner_radius);
        this.A0C = resources.getDimension(R.dimen.bottom_button_divider_margin_small);
        this.A05 = resources.getDimension(R.dimen.bottom_button_divider_margin_medium);
        this.A0J = resources.getDimension(R.dimen.account_discovery_bottom_gap);
        this.A09 = resources.getDimension(R.dimen.boost_guidance_preview_width);
        this.A0A = resources.getDimension(R.dimen.news_feed_placeholder_text_short_width);
        this.A0B = resources.getDimension(R.dimen.news_feed_placeholder_standard_paragraph_text_width);
        this.A07 = resources.getDimension(R.dimen.news_feed_placeholder_section_three_long_rect_width);
        this.A08 = resources.getDimension(R.dimen.news_feed_placeholder_section_three_short_rect_width);
        this.A0H = resources.getDimension(R.dimen.news_feed_placeholder_text_position);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A04(context));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00 = this.A0G;
        int i = 0;
        do {
            A00(canvas);
            A01(canvas, this.A09);
            A01(canvas, this.A0A);
            float f = this.A00;
            float f2 = this.A04;
            this.A00 = f + f2;
            float A022 = AnonymousClass7TE.A02(this);
            A00(canvas);
            float f3 = this.A05;
            float f4 = this.A06;
            float f5 = (A022 - f3) - f4;
            float f6 = this.A00 - this.A0C;
            RectF rectF = this.A0E;
            rectF.set(f5, f6, f5 + f4, f4 + f6);
            Paint paint = this.A0D;
            canvas.drawRect(rectF, paint);
            float[] fArr = A0L;
            int i2 = 0;
            do {
                A01(canvas, fArr[i2] * this.A0B);
                i2++;
            } while (i2 < 4);
            this.A00 += f2;
            float A023 = AnonymousClass7TE.A02(this);
            A00(canvas);
            float f7 = this.A02;
            float f8 = (A023 - f3) - f7;
            float f9 = this.A00;
            rectF.set(f8, f9, f7 + f8, this.A01 + f9);
            float f10 = this.A03;
            canvas.drawRoundRect(rectF, f10, f10, paint);
            A01(canvas, this.A07);
            A01(canvas, this.A08);
            this.A00 += f2;
            i++;
        } while (i < 3);
    }

    private final void A00(Canvas canvas) {
        float f = this.A05;
        float f2 = this.A0I;
        canvas.drawCircle(f + f2, this.A00, f2, this.A0D);
        this.A00 += this.A0C - f2;
    }

    private final void A01(Canvas canvas, float f) {
        RectF rectF = this.A0E;
        float f2 = this.A0H;
        float f3 = this.A00;
        float f4 = this.A0J;
        rectF.set(f2, f3, f + f2, f4 + f3);
        float f5 = this.A0K;
        canvas.drawRoundRect(rectF, f5, f5, this.A0D);
        this.A00 += f4 + this.A0F;
    }
}
