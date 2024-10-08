package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.9SA  reason: invalid class name */
public abstract class AnonymousClass9SA {
    public static final void A00(Drawable drawable, ImageView imageView, float f, float f2, boolean z) {
        float f3;
        C339117j5 r0;
        0qQ.A0B(imageView, 1);
        Matrix matrix = new Matrix();
        float intrinsicWidth = ((float) drawable.getIntrinsicWidth()) * f2;
        float intrinsicHeight = ((float) drawable.getIntrinsicHeight()) * f2;
        if (!z || (intrinsicWidth <= ((float) imageView.getWidth()) && intrinsicHeight <= ((float) imageView.getHeight()))) {
            f3 = f * f2;
        } else {
            float width = ((float) imageView.getWidth()) / intrinsicWidth;
            float height = ((float) imageView.getHeight()) / intrinsicHeight;
            if (width > height) {
                width = height;
            }
            f3 = width * f * f2;
        }
        if ((drawable instanceof C339117j5) && (r0 = (C339117j5) drawable) != null) {
            r0.EOg(f);
        }
        imageView.setImageDrawable(drawable);
        matrix.setScale(f3, f3);
        matrix.postTranslate((((float) imageView.getWidth()) - ((intrinsicWidth * f3) / f2)) / 2.0f, (((float) imageView.getHeight()) - ((intrinsicHeight * f3) / f2)) / 2.0f);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(matrix);
    }
}
