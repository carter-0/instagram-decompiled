package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.3O6  reason: invalid class name */
public final class AnonymousClass3O6 extends AnonymousClass3O7 {
    public float A00;
    public ViewGroup A01;
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
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final Paint A0H;
    public final RectF A0I = new RectF();

    public AnonymousClass3O6(Context context, ViewGroup viewGroup) {
        super(context, (AttributeSet) null);
        float dimension;
        Paint paint = new Paint();
        this.A0H = paint;
        Resources resources = getResources();
        this.A0A = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        float dimension2 = resources.getDimension(R.dimen.album_music_sticker_text_vertical_padding);
        this.A0C = dimension2;
        float dimension3 = resources.getDimension(R.dimen.abc_dropdownitem_icon_width);
        this.A09 = dimension3;
        this.A0E = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A0F = resources.getDimension(R.dimen.ad_not_delivering_thumbnail_height);
        this.A0D = resources.getDimension(R.dimen.abc_button_padding_horizontal_material);
        float dimension4 = resources.getDimension(R.dimen.album_music_sticker_text_vertical_padding);
        this.A0B = dimension4;
        ViewGroup viewGroup2 = this.A01;
        if (viewGroup2 != null) {
            dimension = (float) viewGroup2.getMeasuredWidth();
        } else {
            dimension = resources.getDimension(R.dimen.attached_video_scrubber_height);
        }
        this.A00 = dimension;
        float dimension5 = resources.getDimension(R.dimen.full_width_product_tile_width);
        this.A08 = dimension5;
        float dimension6 = resources.getDimension(R.dimen.asset_picker_static_sticker_last_row_padding);
        this.A07 = dimension6;
        this.A04 = resources.getDimension(R.dimen.ad4ad_button_bottom_margin);
        float dimension7 = resources.getDimension(R.dimen.abc_button_padding_horizontal_material);
        this.A02 = dimension7;
        float dimension8 = resources.getDimension(R.dimen.album_preview_add_item_margin);
        this.A05 = resources.getDimension(R.dimen.main_feed_placeholder_comment_width);
        float dimension9 = resources.getDimension(R.dimen.abc_button_padding_horizontal_material);
        this.A03 = dimension9;
        this.A06 = resources.getDimension(R.dimen.abc_dropdownitem_icon_width);
        this.A0G = (int) (dimension2 + dimension3 + dimension4 + dimension5 + dimension6 + dimension9 + dimension7 + dimension8);
        Context context2 = getContext();
        0qQ.A07(context2);
        this.A00 = (float) ((AnonymousClass2YD) AnonymousClass2YA.A00.invoke(AnonymousClass2YC.A00)).AIh(C61270mF.A00(context2)).A00().width();
        paint.setColor(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_highlight_background)));
        this.A01 = viewGroup;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float f = this.A09;
        float f2 = f / 2.0f;
        float f3 = this.A0A;
        float f4 = 0.0f + this.A0C;
        float f5 = f4 + f2;
        Paint paint = this.A0H;
        canvas.drawCircle(f3 + f2, f5, f2, paint);
        float f6 = f3 + f + this.A0E;
        float f7 = this.A0D;
        float f8 = f5 - (f7 / 2.0f);
        RectF rectF = this.A0I;
        rectF.set(f6, f8, this.A0F + f6, f7 + f8);
        float f9 = this.A06;
        canvas.drawRoundRect(rectF, f9, f9, paint);
        float f10 = f4 + f + this.A0B;
        float f11 = this.A08 + f10;
        rectF.set(0.0f, f10, this.A00 + 0.0f, f11);
        canvas.drawRect(rectF, paint);
        float f12 = this.A04;
        float f13 = f11 + this.A07;
        float f14 = this.A05 + f12;
        float f15 = this.A03;
        float f16 = f15 + f13;
        rectF.set(f12, f13, f14, f16);
        canvas.drawRoundRect(rectF, f9, f9, paint);
        float f17 = f16 + this.A02;
        rectF.set(f12, f17, f14, f17 + f15);
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    public final int getTotalPlaceholderHeight() {
        return this.A0G;
    }
}
