package X;

import android.view.Choreographer;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.6Jv  reason: invalid class name and case insensitive filesystem */
public final class C305856Jv implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C313266gA A01;

    public C305856Jv(C255773uh r1, C313266gA r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C313266gA r2 = this.A01;
        r2.A0B.DaO(this.A00);
        if (r2.A08) {
            IgShowreelCompositionView igShowreelCompositionView = r2.A06;
            if (igShowreelCompositionView != null) {
                igShowreelCompositionView.E2p();
            }
            C313276gB r3 = r2.A0A;
            r3.A00.A02 = System.currentTimeMillis();
            Choreographer.getInstance().postFrameCallback(r3);
        }
    }
}
