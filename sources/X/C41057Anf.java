package X;

import android.widget.ProgressBar;

/* renamed from: X.Anf  reason: case insensitive filesystem */
public final class C41057Anf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass85M A01;

    public C41057Anf(AnonymousClass85M r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        ProgressBar progressBar = this.A01.A02;
        if (progressBar != null) {
            progressBar.setProgress(this.A00);
        }
    }
}
