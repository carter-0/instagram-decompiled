package X;

import android.widget.ProgressBar;

public final class TGR implements Runnable {
    public final /* synthetic */ C7913Qcj A00;
    public final /* synthetic */ boolean A01;

    public TGR(C7913Qcj qcj, boolean z) {
        this.A01 = z;
        this.A00 = qcj;
    }

    public final void run() {
        ProgressBar progressBar;
        boolean z = this.A01;
        C7913Qcj qcj = this.A00;
        if (z) {
            ProgressBar progressBar2 = qcj.A06;
            0qQ.A0A(progressBar2);
            progressBar2.setVisibility(0);
            progressBar = qcj.A07;
        } else {
            progressBar = qcj.A06;
        }
        0qQ.A0A(progressBar);
        progressBar.setVisibility(8);
    }
}
