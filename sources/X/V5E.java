package X;

import android.graphics.Matrix;
import android.graphics.RectF;

public abstract class V5E {
    public static void A00(Matrix matrix, RectF rectF, float f, float f2) {
        matrix.postScale(f, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
    }
}
