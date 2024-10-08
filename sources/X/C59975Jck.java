package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jck  reason: case insensitive filesystem */
public final class C59975Jck extends Drawable {
    public final float A00;
    public final BitmapShader A01;
    public final Paint A02;
    public final RectF A03 = AnonymousClass7TE.A0Y();

    public C59975Jck(Bitmap bitmap, float f) {
        this.A00 = f;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.A01 = bitmapShader;
        Paint A0C = JTO.A0C();
        this.A02 = A0C;
        A0C.setAntiAlias(true);
        A0C.setShader(bitmapShader);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A03;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A03.set(0.0f, 0.0f, (float) rect.width(), (float) rect.height());
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }
}
