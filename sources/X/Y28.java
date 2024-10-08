package X;

import android.view.View;

public final class Y28 implements Runnable {
    public final /* synthetic */ XF9 A00;

    public Y28(XF9 xf9) {
        this.A00 = xf9;
    }

    public final void run() {
        XF9 xf9 = this.A00;
        View view = xf9.A01;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(xf9);
        }
    }
}
