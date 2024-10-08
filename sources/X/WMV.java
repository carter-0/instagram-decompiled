package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public final class WMV implements X34 {
    public final /* synthetic */ W1m A00;

    public WMV(W1m w1m) {
        this.A00 = w1m;
    }

    public final void onViewAttachedToWindow(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            W1m w1m = this.A00;
            WindowInsets rootWindowInsets = w1m.A09.getRootWindowInsets();
            if (rootWindowInsets != null) {
                w1m.A00 = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                W1m.A02(w1m);
            }
        }
    }
}
