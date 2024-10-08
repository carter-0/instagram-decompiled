package X;

import android.view.View;

/* renamed from: X.Krj  reason: case insensitive filesystem */
public abstract class C63115Krj {
    public static final int A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (!(mode == Integer.MIN_VALUE || mode == 1073741824) || size >= size2) {
            size = size2;
        }
        return View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO);
    }
}
