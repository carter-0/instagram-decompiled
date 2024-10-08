package X;

import android.graphics.Matrix;
import android.widget.ImageView;

/* renamed from: X.TuU  reason: case insensitive filesystem */
public abstract class C14347TuU {
    public static void A00(ImageView imageView, float f, float f2, float f3, int i, int i2) {
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix = new Matrix();
        float f4 = (float) i;
        float width = ((float) imageView.getWidth()) / f4;
        matrix.setScale(width, width);
        matrix.postTranslate(width * f4 * f * -1.0f, ((float) i2) * width * f3 * -1.0f);
        float f5 = 1.0f / (f2 - f);
        matrix.postScale(f5, f5);
        imageView.setImageMatrix(matrix);
    }
}
