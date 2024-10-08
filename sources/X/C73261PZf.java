package X;

import android.widget.ProgressBar;

/* renamed from: X.PZf  reason: case insensitive filesystem */
public final class C73261PZf implements Runnable {
    public final /* synthetic */ PMT A00;
    public final /* synthetic */ C68290N9d A01;

    public C73261PZf(PMT pmt, C68290N9d n9d) {
        this.A01 = n9d;
        this.A00 = pmt;
    }

    public final void run() {
        Integer num = this.A01.A03;
        if (num != null) {
            PMT pmt = this.A00;
            ((ProgressBar) pmt.A0A.getValue()).setProgress(num.intValue());
        }
    }
}
