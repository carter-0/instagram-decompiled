package X;

import android.animation.ObjectAnimator;
import android.widget.ProgressBar;

public final class TGS implements Runnable {
    public final /* synthetic */ C7913Qcj A00;
    public final /* synthetic */ boolean A01;

    public TGS(C7913Qcj qcj, boolean z) {
        this.A01 = z;
        this.A00 = qcj;
    }

    public final void run() {
        boolean z = this.A01;
        C7913Qcj qcj = this.A00;
        if (z) {
            ProgressBar progressBar = qcj.A08;
            0qQ.A0A(progressBar);
            progressBar.setProgress(0);
            ProgressBar progressBar2 = qcj.A08;
            0qQ.A0A(progressBar2);
            DbY.A0G(progressBar2).start();
            ObjectAnimator objectAnimator = qcj.A00;
            if (objectAnimator != null) {
                objectAnimator.addListener(qcj.A0E);
                ObjectAnimator objectAnimator2 = qcj.A00;
                0qQ.A0A(objectAnimator2);
                objectAnimator2.start();
                return;
            }
            return;
        }
        ProgressBar progressBar3 = qcj.A08;
        0qQ.A0A(progressBar3);
        C51972G9s.A0I(progressBar3).start();
        ObjectAnimator objectAnimator3 = qcj.A00;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllListeners();
            ObjectAnimator objectAnimator4 = qcj.A00;
            0qQ.A0A(objectAnimator4);
            objectAnimator4.removeAllUpdateListeners();
        }
    }
}
