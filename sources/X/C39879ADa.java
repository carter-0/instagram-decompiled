package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.ADa  reason: case insensitive filesystem */
public final class C39879ADa {
    public static final RectF A00 = AnonymousClass7TE.A0Y();
    public static final RectF A01 = AnonymousClass7TE.A0Y();
    public static final C39879ADa A02 = new Object();

    public final Bitmap A00(Bitmap.Config config, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix A0U = AnonymousClass7TE.A0U();
        RectF rectF = A00;
        RectF rectF2 = A01;
        rectF.set(0.0f, 0.0f, (float) width, (float) height);
        float f = 0.0f - 100000.0f;
        float f2 = 100000.0f + 224.0f;
        if (width * 224 > height * 224) {
            rectF2.set(f, 0.0f, f2, 224.0f);
        } else {
            rectF2.set(0.0f, f, 224.0f, f2);
        }
        A0U.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        Bitmap createBitmap = Bitmap.createBitmap(224, 224, config);
        0qQ.A07(createBitmap);
        new Canvas(createBitmap).drawBitmap(bitmap, A0U, AnonymousClass7TE.A0V(3));
        return createBitmap;
    }
}
