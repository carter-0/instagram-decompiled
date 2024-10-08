package X;

import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.ProgressBar;

/* renamed from: X.TIm  reason: case insensitive filesystem */
public final class C13030TIm implements Runnable {
    public final /* synthetic */ C7913Qcj A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C13030TIm(C7913Qcj qcj, boolean z, boolean z2) {
        this.A00 = qcj;
        this.A02 = z;
        this.A01 = z2;
    }

    public final void run() {
        ViewPropertyAnimator withEndAction;
        C7913Qcj qcj = this.A00;
        ImageButton imageButton = qcj.A03;
        0qQ.A0A(imageButton);
        boolean z = this.A02;
        imageButton.setEnabled(z);
        if (!z) {
            ImageButton imageButton2 = qcj.A03;
            0qQ.A0A(imageButton2);
            if (imageButton2.getVisibility() == 0) {
                if (!qcj.A04) {
                    ProgressBar progressBar = qcj.A07;
                    0qQ.A0A(progressBar);
                    progressBar.setVisibility(0);
                    if (this.A01) {
                        ProgressBar progressBar2 = qcj.A07;
                        0qQ.A0A(progressBar2);
                        withEndAction = DbY.A0G(progressBar2);
                        withEndAction.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        boolean z2 = this.A01;
        ProgressBar progressBar3 = qcj.A07;
        if (z2) {
            0qQ.A0A(progressBar3);
            withEndAction = C51972G9s.A0I(progressBar3).withEndAction(new C12895TCj(qcj));
            withEndAction.start();
            return;
        }
        Pxi.A18(progressBar3);
    }
}
