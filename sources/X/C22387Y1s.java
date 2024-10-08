package X;

import android.view.View;

/* renamed from: X.Y1s  reason: case insensitive filesystem */
public final class C22387Y1s implements Runnable {
    public final /* synthetic */ XuX A00;

    public C22387Y1s(XuX xuX) {
        this.A00 = xuX;
    }

    public final void run() {
        XuX xuX = this.A00;
        xuX.A02.invoke();
        View view = xuX.A01;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(xuX);
        }
    }
}
