package X;

import android.view.View;

public final class TBU implements Runnable {
    public final /* synthetic */ C11511SbY A00;

    public TBU(C11511SbY sbY) {
        this.A00 = sbY;
    }

    public final void run() {
        C11511SbY sbY = this.A00;
        sbY.A01.invoke();
        View view = sbY.A00;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(sbY);
        }
    }
}
