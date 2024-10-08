package X;

import android.widget.ProgressBar;

/* renamed from: X.Ane  reason: case insensitive filesystem */
public final class C41056Ane implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass85M A01;

    public C41056Ane(AnonymousClass85M r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        ProgressBar progressBar = this.A01.A01;
        if (progressBar != null) {
            progressBar.setProgress(this.A00);
        }
    }
}
