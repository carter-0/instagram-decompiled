package X;

import android.content.Context;
import android.util.DisplayMetrics;

public final class U9d extends AnonymousClass52S {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U9d(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    public final float A07(DisplayMetrics displayMetrics) {
        float f;
        float f2;
        switch (this.A00) {
            case 1:
                0qQ.A0B(displayMetrics, 0);
                f = (float) displayMetrics.densityDpi;
                f2 = 6500.0f;
                break;
            case 2:
                0qQ.A0B(displayMetrics, 0);
                f = (float) displayMetrics.densityDpi;
                f2 = 10.0f;
                break;
            default:
                return super.A07(displayMetrics);
        }
        return f2 / f;
    }

    public final int A08() {
        if (this.A00 != 0) {
            return super.A08();
        }
        return -1;
    }

    public final int A09() {
        switch (this.A00) {
            case 2:
            case 3:
                return -1;
            default:
                return super.A09();
        }
    }
}
