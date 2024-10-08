package X;

import android.view.View;

public abstract class VC2 {
    public static final boolean A00(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f <= ((float) i) || f >= ((float) (i + view.getWidth())) || f2 <= ((float) i2) || f2 >= ((float) (i2 + view.getHeight()))) {
            return false;
        }
        return true;
    }
}
