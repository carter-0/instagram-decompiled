package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public final class GVD extends Drawable {
    public float A00;
    public final int A01;
    public final int A02;
    public final Paint A03;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public GVD(int i, int i2) {
        Paint paint = new Paint(1);
        this.A03 = paint;
        this.A01 = i;
        this.A02 = i2;
        paint.setStyle(Paint.Style.FILL);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        AnonymousClass7TF.A13(canvas, bounds);
        float width = ((float) bounds.width()) / 2.0f;
        canvas.drawCircle(width, width, this.A00, this.A03);
        canvas.restore();
    }

    public final void onBoundsChange(Rect rect) {
        float f = (float) this.A02;
        float width = (((float) rect.width()) / 2.0f) + f;
        this.A00 = width;
        float f2 = 1.0f - (f / width);
        int i = this.A01;
        this.A03.setShader(new RadialGradient(((float) rect.width()) / 2.0f, ((float) rect.width()) / 2.0f, this.A00, new int[]{i, i, 0}, new float[]{0.0f, f2, 1.0f}, Shader.TileMode.CLAMP));
    }
}
