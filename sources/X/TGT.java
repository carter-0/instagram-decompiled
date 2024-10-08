package X;

import com.facebook.smartcapture.components.ContourView;

public final class TGT implements Runnable {
    public final /* synthetic */ C7913Qcj A00;
    public final /* synthetic */ CharSequence A01;

    public TGT(C7913Qcj qcj, CharSequence charSequence) {
        this.A00 = qcj;
        this.A01 = charSequence;
    }

    public final void run() {
        ContourView contourView = this.A00.A0A;
        if (contourView != null) {
            contourView.setTextTip(this.A01);
        }
    }
}
