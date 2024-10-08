package X;

import android.widget.ProgressBar;

/* renamed from: X.TCm  reason: case insensitive filesystem */
public final class C12898TCm implements Runnable {
    public final /* synthetic */ C7925Qcw A00;

    public C12898TCm(C7925Qcw qcw) {
        this.A00 = qcw;
    }

    public final void run() {
        C7925Qcw qcw = this.A00;
        ProgressBar progressBar = qcw.A0J;
        0qQ.A0A(progressBar);
        C51972G9s.A0I(progressBar).withEndAction(new C12897TCl(qcw)).start();
    }
}
