package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.3gR  reason: invalid class name and case insensitive filesystem */
public final class C247503gR {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.2VX, android.graphics.Matrix] */
    public final AnonymousClass2VX A00(Drawable drawable, ImageView.ScaleType scaleType, int i, int i2) {
        Matrix.ScaleToFit scaleToFit;
        float min;
        float f;
        float f2;
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || ImageView.ScaleType.FIT_XY == scaleType || ImageView.ScaleType.MATRIX == scaleType || (i == intrinsicWidth && i2 == intrinsicHeight)) {
            return null;
        }
        ? matrix = new Matrix();
        boolean z = true;
        if (ImageView.ScaleType.CENTER == scaleType) {
            matrix.setTranslate((float) AnonymousClass2Tt.A00(((float) (i - intrinsicWidth)) * 0.5f), (float) AnonymousClass2Tt.A00(((float) (i2 - intrinsicHeight)) * 0.5f));
            if (intrinsicWidth <= i && intrinsicHeight <= i2) {
                z = false;
            }
        } else {
            float f3 = 0.0f;
            if (ImageView.ScaleType.CENTER_CROP == scaleType) {
                if (intrinsicWidth * i2 > i * intrinsicHeight) {
                    f = ((float) i2) / ((float) intrinsicHeight);
                    f3 = (((float) i) - (((float) intrinsicWidth) * f)) * 0.5f;
                    f2 = 0.0f;
                } else {
                    f = ((float) i) / ((float) intrinsicWidth);
                    f2 = (((float) i2) - (((float) intrinsicHeight) * f)) * 0.5f;
                }
                matrix.setScale(f, f);
                matrix.postTranslate((float) AnonymousClass2Tt.A00(f3), (float) AnonymousClass2Tt.A00(f2));
            } else if (ImageView.ScaleType.CENTER_INSIDE == scaleType) {
                if (intrinsicWidth > i || intrinsicHeight > i2) {
                    min = Math.min(((float) i) / ((float) intrinsicWidth), ((float) i2) / ((float) intrinsicHeight));
                } else {
                    min = 1.0f;
                }
                matrix.setScale(min, min);
                matrix.postTranslate((float) AnonymousClass2Tt.A00((((float) i) - (((float) intrinsicWidth) * min)) * 0.5f), (float) AnonymousClass2Tt.A00((((float) i2) - (((float) intrinsicHeight) * min)) * 0.5f));
                return matrix;
            } else {
                RectF rectF = new RectF();
                RectF rectF2 = new RectF();
                rectF.set(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight);
                rectF2.set(0.0f, 0.0f, (float) i, (float) i2);
                int i3 = C271184i5.A00[scaleType.ordinal()];
                if (i3 == 1) {
                    scaleToFit = Matrix.ScaleToFit.FILL;
                } else if (i3 == 2) {
                    scaleToFit = Matrix.ScaleToFit.START;
                } else if (i3 == 3) {
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                } else if (i3 == 4) {
                    scaleToFit = Matrix.ScaleToFit.END;
                } else {
                    throw new IllegalArgumentException("Only FIT_... values allowed");
                }
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
                return matrix;
            }
        }
        matrix.A00 = z;
        return matrix;
    }
}
