package X;

import android.view.Choreographer;

public final class XF0 implements Choreographer.FrameCallback {
    public final /* synthetic */ C21097XEl A00;

    public XF0(C21097XEl xEl) {
        this.A00 = xEl;
    }

    public final void doFrame(long j) {
        C21097XEl xEl = this.A00;
        if (xEl.A07) {
            Choreographer choreographer = xEl.A04;
            if (choreographer != null) {
                choreographer.removeFrameCallback(xEl.A01);
            }
            xEl.A05 = null;
            xEl.A07 = false;
            return;
        }
        C341127mN r6 = xEl.A05;
        Long l = xEl.A06;
        if (l == null || r6 == null) {
            Choreographer choreographer2 = xEl.A04;
            if (choreographer2 != null) {
                choreographer2.removeFrameCallback(xEl.A01);
            }
        } else if (xEl.A00 <= j) {
            long longValue = l.longValue();
            xEl.A00 = longValue * ((j / longValue) + 1);
            r6.EEt(Long.valueOf(j));
        } else {
            C21097XEl.A00(xEl);
        }
    }
}
