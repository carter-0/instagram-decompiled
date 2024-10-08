package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.direct.ui.DirectShareShimmerView;

/* renamed from: X.61s  reason: invalid class name and case insensitive filesystem */
public final class C3021361s extends Drawable {
    public final float A00;
    public final float A01 = (100.0f * this.A08);
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final RectF A0A;
    public final /* synthetic */ DirectShareShimmerView A0B;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        float f = (float) bounds.top;
        while (true) {
            float f2 = this.A07;
            if (f2 + f < ((float) bounds.bottom)) {
                float width = (float) bounds.width();
                float f3 = this.A02;
                float f4 = this.A04;
                Paint paint = this.A09;
                canvas.drawCircle(f3, this.A03 + f, f4, paint);
                RectF rectF = this.A0A;
                float f5 = f3 + f4 + this.A00;
                float f6 = f2 / 3.0f;
                float f7 = this.A05;
                float f8 = this.A01;
                float f9 = this.A06;
                rectF.set(f5, (f6 - f7) + f, width - f8, f6 + f9 + f);
                canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                float f10 = f6 * 2.0f;
                rectF.set(f5, (f10 - f9) + f, width - (f8 * 2.0f), f10 + f7 + f);
                canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                f += f2;
            } else {
                return;
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public C3021361s(Resources resources, DirectShareShimmerView directShareShimmerView) {
        this.A0B = directShareShimmerView;
        Paint paint = new Paint(1);
        this.A09 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(directShareShimmerView.getContext().getColor(R.color.grey_1));
        this.A08 = resources.getDisplayMetrics().density;
        Resources resources2 = directShareShimmerView.getResources();
        float dimension = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        this.A07 = dimension;
        float f = dimension / 2.0f;
        this.A02 = resources2.getDimension(R.dimen.abc_edit_text_inset_top_material) + f;
        this.A03 = f;
        this.A04 = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / 2.0f;
        this.A00 = resources2.getDimension(R.dimen.account_discovery_bottom_gap);
        this.A06 = resources2.getDimension(R.dimen.accent_edge_thickness);
        this.A05 = resources2.getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        this.A0A = new RectF();
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
