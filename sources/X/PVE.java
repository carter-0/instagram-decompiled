package X;

import android.view.ViewGroup;

public final class PVE implements Runnable {
    public final /* synthetic */ NJq A00;

    public PVE(NJq nJq) {
        this.A00 = nJq;
    }

    public final void run() {
        NJq nJq = this.A00;
        ViewGroup viewGroup = nJq.A03;
        if (viewGroup != null) {
            viewGroup.setBottom(viewGroup.getBottom() + AnonymousClass2uJ.A00);
            0nA.A0r(nJq.A03, this);
        }
    }
}
