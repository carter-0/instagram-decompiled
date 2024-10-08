package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.instagram.android.R;

/* renamed from: X.UmV  reason: case insensitive filesystem */
public final class C15988UmV extends AnonymousClass3O7 {
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
    public final Paint A0C;
    public final RectF A0D = new RectF();

    public C15988UmV(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.A0C = paint;
        Resources resources = getResources();
        this.A00 = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A08 = resources.getDimension(R.dimen.account_discovery_bottom_gap);
        this.A07 = resources.getDimension(R.dimen.abc_dropdownitem_icon_width);
        this.A0A = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A0B = resources.getDimension(R.dimen.clips_editor_timeline_v3_single_segment_drawer_height);
        this.A09 = resources.getDimension(R.dimen.action_bar_item_spacing_right);
        this.A03 = resources.getDimension(R.dimen.abc_dialog_padding_top_material);
        float dimension = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A01 = dimension;
        float dimension2 = resources.getDimension(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        this.A05 = resources.getDimension(R.dimen.full_height_media_shimmer_comment_width);
        float dimension3 = resources.getDimension(R.dimen.action_bar_item_spacing_right);
        this.A02 = dimension3;
        this.A06 = resources.getDimension(R.dimen.abc_dropdownitem_icon_width);
        this.A04 = dimension2 + dimension3 + dimension + dimension3;
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0C(context));
        setBackgroundResource(2Yu.A04(context));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float f = this.A07;
        float f2 = f / 2.0f;
        float f3 = this.A00;
        float f4 = 0.0f + this.A08 + f2;
        Paint paint = this.A0C;
        canvas.drawCircle(f3 + f2, f4, f2, paint);
        float f5 = f3 + f + this.A0A;
        float f6 = this.A09;
        float f7 = f4 - (f6 / 2.0f);
        RectF rectF = this.A0D;
        rectF.set(f5, f7, this.A0B + f5, f6 + f7);
        float f8 = this.A06;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        float f9 = this.A03;
        float measuredHeight = 0.0f + (((float) getMeasuredHeight()) - this.A04);
        float f10 = this.A05 + f9;
        float f11 = this.A02;
        float f12 = f11 + measuredHeight;
        rectF.set(f9, measuredHeight, f10, f12);
        canvas.drawRoundRect(rectF, f8, f8, paint);
        float f13 = f12 + this.A01;
        rectF.set(f9, f13, f10, f13 + f11);
        canvas.drawRoundRect(rectF, f8, f8, paint);
    }
}
