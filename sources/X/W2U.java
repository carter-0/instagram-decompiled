package X;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.react.bridge.ReadableMap;

public final class W2U {
    public static float A03(int i, float f) {
        if (i != 0) {
            return A02(f, Float.NaN);
        }
        return A01(f);
    }

    public static final float A00(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        return f / C11414SSm.A00().density;
    }

    public static final float A01(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, f, C11414SSm.A00());
    }

    public static final float A02(float f, float f2) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        DisplayMetrics A00 = C11414SSm.A00();
        float applyDimension = TypedValue.applyDimension(2, f, A00);
        if (f2 >= 1.0f) {
            return Math.min(applyDimension, f * A00.density * f2);
        }
        return applyDimension;
    }

    public static float A04(ReadableMap readableMap, String str) {
        return A01((float) readableMap.getDouble(str));
    }
}
