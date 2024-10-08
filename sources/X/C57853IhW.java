package X;

import android.view.Choreographer;
import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;

/* renamed from: X.IhW  reason: case insensitive filesystem */
public final class C57853IhW implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C313246g8 A01;

    public C57853IhW(C255773uh r1, C313246g8 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C313246g8 r2 = this.A01;
        r2.A0A.DaO(this.A00);
        if (r2.A07) {
            IgShowreelNativeProgressView igShowreelNativeProgressView = r2.A05;
            if (igShowreelNativeProgressView != null) {
                igShowreelNativeProgressView.E2p();
            }
            C313256g9 r3 = r2.A09;
            r3.A00.A02 = System.currentTimeMillis();
            Choreographer.getInstance().postFrameCallback(r3);
        }
    }
}
