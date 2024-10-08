package X;

import android.view.View;

/* renamed from: X.PXI  reason: case insensitive filesystem */
public final class C73124PXI implements Runnable {
    public final /* synthetic */ C68079Mzk A00;

    public C73124PXI(C68079Mzk mzk) {
        this.A00 = mzk;
    }

    public final void run() {
        C68079Mzk mzk = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View view = mzk.A05;
        0qQ.A07(view);
        view.setVisibility(8);
    }
}
