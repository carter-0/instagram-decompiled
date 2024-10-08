package X;

import android.view.View;

public final class TBV implements Runnable {
    public final /* synthetic */ C11511SbY A00;

    public TBV(C11511SbY sbY) {
        this.A00 = sbY;
    }

    public final void run() {
        C11511SbY sbY = this.A00;
        View view = sbY.A00;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(sbY);
        }
    }
}
