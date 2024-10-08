package X;

import android.view.View;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

public final class PQS implements C315616kD {
    public final int A00;
    public final Object A01;

    public PQS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DaF(C294975nL r4, float f) {
        switch (this.A00) {
            case 0:
                View view = ((OZT) this.A01).A00;
                if (view != null) {
                    view.setAlpha(f);
                    return;
                }
                return;
            case 1:
                View view2 = ((OZT) this.A01).A00;
                if (view2 != null) {
                    view2.setAlpha(1.0f - f);
                    return;
                }
                return;
            case 2:
                DirectVisualMessageViewerController.A0J((DirectVisualMessageViewerController) this.A01, 1.0f - f);
                return;
            case 3:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                OEL oel = directVisualMessageViewerController.reelViewerShadowAnimator;
                if (oel != null) {
                    oel.A00 = f;
                    oel.A02.A00(oel.A01, f);
                }
                DirectVisualMessageViewerController.A0J(directVisualMessageViewerController, f);
                return;
            default:
                ((C275794rx) this.A01).A0G.A00();
                return;
        }
    }
}
