package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public abstract class XD6 {
    public static float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return XD7.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return XD7.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static EdgeEffect A02(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return XD7.A02(context, attributeSet);
        }
        return new EdgeEffect(context);
    }
}
