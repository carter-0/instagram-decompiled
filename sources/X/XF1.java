package X;

import android.view.Choreographer;

public final class XF1 implements Runnable {
    public final /* synthetic */ C21097XEl A00;

    public XF1(C21097XEl xEl) {
        this.A00 = xEl;
    }

    public final void run() {
        C21097XEl xEl = this.A00;
        Choreographer choreographer = xEl.A04;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            xEl.A04 = choreographer;
        }
        XF0 xf0 = xEl.A01;
        choreographer.removeFrameCallback(xf0);
        choreographer.postFrameCallback(xf0);
    }
}
