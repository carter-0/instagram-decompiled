package X;

import android.view.animation.PathInterpolator;

public abstract class V53 {
    public static PathInterpolator A00(C276544tV r6) {
        if (r6 == null) {
            return new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f);
        }
        return new PathInterpolator(r6.A02(35, 0.0f), r6.A02(38, 0.0f), r6.A02(36, 1.0f), r6.A02(40, 1.0f));
    }
}
