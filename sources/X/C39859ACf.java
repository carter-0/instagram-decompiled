package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.ACf  reason: case insensitive filesystem */
public abstract class C39859ACf {
    public static final RectF A00 = AnonymousClass7TE.A0Y();
    public static final RectF A01 = AnonymousClass7TE.A0Y();

    /* JADX WARNING: type inference failed for: r0v8, types: [android.widget.ImageView, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public static final void A00(Drawable drawable, C380509Yl r8, C317876nz r9, int i, int i2) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        RectF rectF = A01;
        rectF.set(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight);
        RectF rectF2 = A00;
        rectF2.set(0.0f, 0.0f, (float) i, (float) i2);
        Matrix matrix = r8.A01;
        matrix.reset();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = ((C317966o8) r9.A0O.get(0)).A07;
        matrix.postScale(f, f, rectF2.centerX(), rectF2.centerY());
        r8.A03.setImageMatrix(matrix);
    }
}
