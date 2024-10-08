package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.U0h  reason: case insensitive filesystem */
public final class C14661U0h extends Drawable {
    public boolean A00 = false;
    public boolean A01;
    public Bitmap A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final Paint A06;
    public final Paint A07;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        if (this.A02 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ALPHA_8);
            this.A02 = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            if (this.A00) {
                Path path = new Path();
                int i = 1;
                if (this.A01) {
                    i = -1;
                }
                float f = this.A03;
                float f2 = ((float) i) * f;
                float f3 = this.A04;
                Path.Direction direction = Path.Direction.CW;
                path.addCircle((((float) canvas2.getWidth()) / 2.0f) - f2, (((float) canvas2.getHeight()) / 2.0f) - f, f3, direction);
                path.addCircle((((float) canvas2.getWidth()) / 2.0f) + f2, (((float) canvas2.getHeight()) / 2.0f) + f, f3, direction);
                path.setFillType(Path.FillType.WINDING);
                canvas2.drawPath(path, this.A06);
            } else {
                canvas2.drawCircle(((float) canvas2.getWidth()) / 2.0f, ((float) canvas2.getHeight()) / 2.0f, this.A05, this.A06);
            }
        }
        canvas.drawBitmap(this.A02, 0.0f, 0.0f, this.A07);
    }

    public C14661U0h(Context context) {
        Resources resources = context.getResources();
        this.A05 = ((float) resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material)) + ((float) resources.getDimensionPixelSize(R.dimen.captions_context_menu_gap));
        this.A04 = ((float) resources.getDimensionPixelSize(R.dimen.bubble_external_padding)) + ((float) resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        this.A03 = (float) resources.getDimensionPixelOffset(R.dimen.direct_reply_avatar_button_double_overlap_offset);
        int color = resources.getColor(R.color.black_40_transparent);
        Paint paint = new Paint(1);
        this.A06 = paint;
        paint.setShadowLayer((float) JTP.A03(resources), 0.0f, 0.0f, color);
        Paint paint2 = new Paint(1);
        this.A07 = paint2;
        paint2.setColorFilter(AnonymousClass37O.A00(-16777216));
        this.A01 = 0mk.A02(context);
    }
}
