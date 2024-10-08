package X;

import android.os.Build;
import android.view.View;

public final class PVP implements Runnable {
    public final /* synthetic */ NJ8 A00;

    public PVP(NJ8 nj8) {
        this.A00 = nj8;
    }

    public final void run() {
        View view;
        if (Build.VERSION.SDK_INT >= 30 && (view = this.A00.mView) != null) {
            view.performHapticFeedback(16);
        }
    }
}
