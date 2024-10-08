package X;

import com.instagram.common.ui.base.IgTextView;

public final class PVR implements Runnable {
    public final /* synthetic */ C67943MxT A00;

    public PVR(C67943MxT mxT) {
        this.A00 = mxT;
    }

    public final void run() {
        C67943MxT mxT = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        IgTextView igTextView = mxT.A01;
        AnonymousClass7PT.A00(igTextView.getBackground(), igTextView.getTop());
    }
}
