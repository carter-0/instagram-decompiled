package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;

@Deprecated
/* renamed from: X.9XQ  reason: invalid class name */
public final class AnonymousClass9XQ extends ShapeDrawable implements AnonymousClass7OE {
    public int A00 = 255;
    public int A01;
    public ColorStateList A02;
    public Shader A03;
    public int A04;
    public final Paint A05 = AnonymousClass7TE.A0V(1);
    public final Matrix A06 = AnonymousClass7TE.A0U();
    public final Paint A07 = AnonymousClass7TE.A0V(1);

    public static void A00(AnonymousClass9XQ r3) {
        if (r3.A03 != null) {
            Matrix matrix = r3.A06;
            matrix.setTranslate(0.0f, (float) (-r3.A04));
            r3.A03.setLocalMatrix(matrix);
        }
    }

    public final void Eov(int i) {
        if (this.A04 != i && this.A03 != null) {
            this.A04 = i;
            A00(this);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.A05;
        int alpha = paint.getAlpha();
        int i = this.A00;
        int i2 = (alpha * (i + (i >> 7))) >> 8;
        if (i2 != 0) {
            paint.setAlpha(i2);
            getShape().draw(canvas, paint);
            paint.setAlpha(alpha);
        }
        this.A07.getAlpha();
    }

    public final int getOpacity() {
        int alpha = this.A05.getAlpha();
        int i = this.A00;
        int i2 = (alpha * (i + (i >> 7))) >> 8;
        this.A07.getAlpha();
        if (i2 == 0) {
            return -2;
        }
        return -3;
    }

    public final boolean isStateful() {
        return AnonymousClass7TF.A1V(this.A02);
    }

    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.A02;
        if (colorStateList != null) {
            this.A05.setColor(colorStateList.getColorForState(getState(), this.A01));
        }
        invalidateSelf();
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AnonymousClass9XQ(Shape shape) {
        super(shape);
    }

    public final int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00(this);
    }
}
