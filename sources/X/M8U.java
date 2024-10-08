package X;

import android.widget.Scroller;

public final class M8U implements Runnable {
    public Integer A00 = AnonymousClass05K.A0C;
    public final Scroller A01;
    public final /* synthetic */ C60059Jea A02;

    public M8U(C60059Jea jea) {
        this.A02 = jea;
        this.A01 = new Scroller(jea.getContext());
    }

    public final void run() {
        Scroller scroller = this.A01;
        boolean isFinished = scroller.isFinished();
        C60059Jea jea = this.A02;
        if (!isFinished) {
            float currX = (float) scroller.getCurrX();
            jea.A00 = currX;
            float f = jea.A02 - currX;
            jea.A02 = currX;
            Integer num = this.A00;
            if (((num == AnonymousClass05K.A01 && f <= 0.0f) || (num == AnonymousClass05K.A00 && f > 0.0f)) && !C60059Jea.A05(jea, f)) {
                scroller.forceFinished(true);
                jea.removeCallbacks(this);
            }
            if (scroller.computeScrollOffset()) {
                jea.postOnAnimation(this);
                return;
            }
        }
        MQ3 mq3 = jea.A0L;
        if (mq3 != null) {
            C60688JpZ jpZ = ((C64858LjK) mq3).A00;
            C66544MVy mVy = jpZ.A02;
            C60059Jea jea2 = jpZ.A01;
            mVy.DlW(jea2.A0H, jea2.A0G);
        }
    }
}
