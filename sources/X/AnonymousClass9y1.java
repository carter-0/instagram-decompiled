package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

/* renamed from: X.9y1  reason: invalid class name */
public abstract class AnonymousClass9y1 {
    public static final Bitmap A00(Bitmap bitmap, String str, float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        Bitmap bitmap2 = bitmap;
        0qQ.A0B(str, 1);
        if (bitmap2 == null && (bitmap2 = BitmapFactory.decodeFile(str, new BitmapFactory.Options())) == null) {
            return null;
        }
        Matrix A0U = AnonymousClass7TE.A0U();
        A0U.postRotate(f3);
        float f6 = -1.0f;
        if (AnonymousClass7TF.A1Q((f3 > 90.0f ? 1 : (f3 == 90.0f ? 0 : -1))) || f3 == 270.0f) {
            float width = f2 / ((float) bitmap2.getWidth());
            float height = f / ((float) bitmap2.getHeight());
            if (!z) {
                f6 = 1.0f;
            }
            f4 = height * f6;
            f5 = width;
        } else {
            float width2 = f / ((float) bitmap2.getWidth());
            if (!z) {
                f6 = 1.0f;
            }
            f5 = f6 * width2;
            f4 = f2 / ((float) bitmap2.getHeight());
        }
        A0U.preScale(f5, f4);
        int width3 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        0fO.A03(bitmap2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width3, height2, A0U, true);
        0qQ.A07(createBitmap);
        if (bitmap2.equals(createBitmap)) {
            return createBitmap;
        }
        bitmap2.recycle();
        return createBitmap;
    }
}
