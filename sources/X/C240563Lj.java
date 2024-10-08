package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.3Lj  reason: invalid class name and case insensitive filesystem */
public final class C240563Lj extends Drawable {
    public final Bitmap A00;
    public final Paint A01;
    public final RectF A02 = new RectF();
    public final boolean A03;

    public C240563Lj(Bitmap bitmap, boolean z) {
        float f;
        0qQ.A0B(bitmap, 1);
        this.A00 = bitmap;
        this.A03 = z;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = new Paint(7);
        paint.setShader(bitmapShader);
        this.A01 = paint;
        Matrix matrix = new Matrix();
        if (z) {
            float height = (float) bitmap.getHeight();
            float width = (float) bitmap.getWidth();
            float f2 = 0.0f;
            if (width > height) {
                f = (height - width) / 2.0f;
            } else {
                f = 0.0f;
            }
            matrix.setTranslate(f, height > width ? (width - height) / 2.0f : f2);
        }
        bitmapShader.setLocalMatrix(matrix);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A02;
        rectF.set(getBounds());
        if (rectF.height() > rectF.width()) {
            rectF.inset(0.0f, (rectF.height() - rectF.width()) / 2.0f);
        } else if (rectF.height() < rectF.width()) {
            rectF.inset((rectF.width() - rectF.height()) / 2.0f, 0.0f);
        }
        canvas.drawOval(rectF, this.A01);
    }

    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        boolean z = this.A03;
        Bitmap bitmap = this.A00;
        if (z) {
            return Math.min(bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmap.getHeight();
    }

    public final int getIntrinsicWidth() {
        boolean z = this.A03;
        Bitmap bitmap = this.A00;
        if (z) {
            return Math.min(bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmap.getWidth();
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
