package X;

import android.view.View;

public final class WBQ implements View.OnLayoutChangeListener {
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        view.requestApplyInsets();
    }
}
