package X;

import android.view.View;

public final class Y27 implements Runnable {
    public final /* synthetic */ XF9 A00;

    public Y27(XF9 xf9) {
        this.A00 = xf9;
    }

    public final void run() {
        XF9 xf9 = this.A00;
        xf9.A02.invoke();
        View view = xf9.A01;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(xf9);
        }
    }
}
