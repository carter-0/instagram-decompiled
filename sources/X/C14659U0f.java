package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.U0f  reason: case insensitive filesystem */
public final class C14659U0f extends Drawable {
    public Bitmap A00;
    public final Paint A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Rect A05 = new Rect();
    public final Rect A06 = new Rect();

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C14659U0f(Context context) {
        Paint paint = new Paint(1);
        this.A01 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.A04 = paint2;
        JTO.A1N(paint2);
        AnonymousClass7TE.A1N(context, paint2, R.color.canvas_bottom_sheet_description_text_color);
        paint2.setStrokeWidth(0nA.A00(context, 1.5f));
        Paint paint3 = new Paint(3);
        this.A03 = paint3;
        paint3.setStyle(style);
        this.A02 = C13988Tno.A09(context, 5);
        paint3.setColorFilter(DbV.A06(context, R.color.canvas_bottom_sheet_description_text_color));
        this.A01.setColor(C13988Tno.A08(context));
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((float) bounds.width()) / 2.0f, this.A01);
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((float) bounds.width()) / 2.0f, this.A04);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            Rect rect = this.A06;
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Rect rect2 = this.A05;
            int i = bounds.left;
            int i2 = this.A02;
            rect2.set(i + i2, bounds.top + i2, bounds.right - i2, bounds.bottom - i2);
            canvas.drawBitmap(bitmap, rect, rect2, this.A03);
        }
    }
}
