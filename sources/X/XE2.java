package X;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

public abstract class XE2 {
    public static final float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return XE6.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static final float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return XE6.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static final EdgeEffect A02(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return XE6.A02(context);
        }
        return new XE7(context);
    }

    public static final void A03(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof XE7) {
            XE7 xe7 = (XE7) edgeEffect;
            float f2 = xe7.A00 + f;
            xe7.A00 = f2;
            if (Math.abs(f2) > xe7.A01) {
                xe7.onRelease();
                return;
            }
            return;
        }
        edgeEffect.onRelease();
    }

    public static final void A04(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }
}
