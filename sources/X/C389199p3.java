package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.instagram.android.R;

/* renamed from: X.9p3  reason: invalid class name and case insensitive filesystem */
public final class C389199p3 extends AnonymousClass3O7 {
    public float A00;
    public float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final RectF A0A = AnonymousClass7TE.A0Y();
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final float A0G;

    public C389199p3(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.A09 = paint;
        Resources resources = getResources();
        this.A0G = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0F = resources.getDimension(R.dimen.achievements_only_you_bottom_margin);
        this.A06 = resources.getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        this.A05 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A07 = resources.getDimension(R.dimen.bottomsheet_action_button_row_icon_margin_end);
        this.A0B = resources.getDimension(R.dimen.comment_input_row_avatar_suggestion_vertical_padding);
        this.A02 = resources.getDimension(R.dimen.filter_label_text_bottom);
        this.A03 = resources.getDimension(R.dimen.abc_control_corner_material);
        this.A08 = resources.getDimension(R.dimen.direct_composer_redesign_background_height);
        this.A0D = resources.getDimension(R.dimen.audio_dubbing_gen_ai_gif_size);
        this.A0C = resources.getDimension(R.dimen.ai_agent_embodiment_video_container_size);
        this.A0E = resources.getDimension(R.dimen.album_music_sticker_text_vertical_padding);
        this.A04 = resources.getDimension(R.dimen.failed_upload_indicator_size_xlarge);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A04(context));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float f = this.A0G;
        this.A01 = f;
        float f2 = this.A0F;
        this.A00 = f2;
        float f3 = this.A08;
        Paint paint = this.A09;
        canvas.drawCircle(f2 + f3, f + f3, f3, paint);
        this.A01 += (f3 * 2.0f) + this.A07;
        this.A00 -= this.A06;
        A00(canvas, this.A0D);
        A00(canvas, this.A0C);
        float A022 = AnonymousClass7TE.A02(this);
        float f4 = this.A00 - this.A05;
        this.A00 = f4;
        float f5 = this.A01 + this.A02;
        this.A01 = f5;
        RectF rectF = this.A0A;
        rectF.set(f4, f5, (A022 - (f4 * 2.0f)) + f4, this.A04 + f5);
        float f6 = this.A03;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    private final void A00(Canvas canvas, float f) {
        RectF rectF = this.A0A;
        float f2 = this.A00;
        float f3 = this.A01;
        float f4 = this.A0E;
        rectF.set(f2, f3, f + f2, f4 + f3);
        float f5 = this.A03;
        canvas.drawRoundRect(rectF, f5, f5, this.A09);
        this.A01 += f4 + this.A0B;
    }
}
