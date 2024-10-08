package X;

import android.widget.ProgressBar;

/* renamed from: X.Ao8  reason: case insensitive filesystem */
public final class C41086Ao8 implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C357918a4 A01;

    public C41086Ao8(C357918a4 r1, double d) {
        this.A01 = r1;
        this.A00 = d;
    }

    public final void run() {
        ProgressBar progressBar = this.A01.A0E;
        if (progressBar != null) {
            progressBar.setProgress((int) (100.0d * this.A00));
        }
    }
}
