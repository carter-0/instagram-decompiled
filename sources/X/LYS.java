package X;

import android.view.View;

public final class LYS implements View.OnLayoutChangeListener {
    public static final LYS A00 = new LYS();

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view.getHeight() != i8 - i6) {
            LRJ.A00 = view.getHeight();
        }
    }
}
