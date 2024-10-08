package X;

import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DottedAlignmentView;

/* renamed from: X.TCf  reason: case insensitive filesystem */
public final class C12891TCf implements Runnable {
    public final /* synthetic */ ContourView A00;

    public C12891TCf(ContourView contourView) {
        this.A00 = contourView;
    }

    public final void run() {
        DottedAlignmentView dottedAlignmentView = this.A00.A0C;
        dottedAlignmentView.post(new C12893TCh(dottedAlignmentView));
        dottedAlignmentView.setVisibility(8);
    }
}
