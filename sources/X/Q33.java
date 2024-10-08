package X;

import android.view.View;

public abstract class Q33 {
    public static boolean A00(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (i == i2) {
            return true;
        }
        if (mode2 == 0 && mode == 0) {
            return true;
        }
        if (mode == 1073741824 && size == i3) {
            return true;
        }
        if (mode2 != Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || i3 > size) {
            return false;
        }
        return true;
    }
}
