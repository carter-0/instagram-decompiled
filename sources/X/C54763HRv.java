package X;

import android.os.Build;
import android.util.DisplayMetrics;

/* renamed from: X.HRv  reason: case insensitive filesystem */
public abstract class C54763HRv {
    public static float A00(DisplayMetrics displayMetrics, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C54762HRu.A00(displayMetrics, f);
        }
        float f2 = displayMetrics.scaledDensity;
        if (f2 != 0.0f) {
            return f / f2;
        }
        return 0.0f;
    }
}
