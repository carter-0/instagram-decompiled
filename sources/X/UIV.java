package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class UIV extends AnonymousClass763 {
    public int A00 = 0;
    public int A01 = 0;
    public Matrix A02;
    public Matrix A03 = new Matrix();
    public PointF A04 = null;
    public AnonymousClass1U5 A05;

    public final void A02() {
        float f;
        float f2;
        Drawable drawable = this.A00;
        Matrix matrix = null;
        if (drawable == null) {
            this.A00 = 0;
            this.A01 = 0;
        } else {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            this.A01 = intrinsicWidth;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.A00 = intrinsicHeight;
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || ((intrinsicWidth == width && intrinsicHeight == height) || this.A05 == AnonymousClass1U5.A08)) {
                drawable.setBounds(bounds);
            } else {
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                matrix = this.A03;
                matrix.reset();
                AnonymousClass1U5 r3 = this.A05;
                PointF pointF = this.A04;
                if (pointF != null) {
                    f = pointF.x;
                    f2 = pointF.y;
                } else {
                    f = 0.5f;
                    f2 = 0.5f;
                }
                ((AnonymousClass1U7) r3).A00(matrix, bounds, f, f2, ((float) bounds.width()) / ((float) intrinsicWidth), ((float) bounds.height()) / ((float) intrinsicHeight), intrinsicWidth, intrinsicHeight);
            }
        }
        this.A02 = matrix;
    }

    public final void C9Q(Matrix matrix) {
        AnonymousClass764 r0 = this.A01;
        if (r0 != null) {
            r0.C9Q(matrix);
        } else {
            matrix.reset();
        }
        Drawable drawable = this.A00;
        if (!(drawable == null || (this.A01 == drawable.getIntrinsicWidth() && this.A00 == drawable.getIntrinsicHeight()))) {
            A02();
        }
        Matrix matrix2 = this.A02;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (!(drawable == null || (this.A01 == drawable.getIntrinsicWidth() && this.A00 == drawable.getIntrinsicHeight()))) {
            A02();
        }
        if (this.A02 != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.A02);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public UIV(Drawable drawable, AnonymousClass1U5 r3) {
        super(drawable);
        this.A05 = r3;
    }

    public final Drawable A01(Drawable drawable) {
        Drawable A012 = super.A01(drawable);
        A02();
        return A012;
    }

    public final void onBoundsChange(Rect rect) {
        A02();
    }
}
