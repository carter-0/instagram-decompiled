package X;

import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.OJu  reason: case insensitive filesystem */
public final class C70748OJu {
    public final /* synthetic */ C68445NIi A00;

    public C70748OJu(C68445NIi nIi) {
        this.A00 = nIi;
    }

    public final void A00() {
        DirectVisualMessageViewerController directVisualMessageViewerController;
        C68445NIi nIi = this.A00;
        C68463NJb A0R = nIi.getChildFragmentManager().A0R(nIi.A06);
        if (A0R != null && A0R.isResumed() && (directVisualMessageViewerController = A0R.A01) != null) {
            directVisualMessageViewerController.A0X("resume");
        }
    }
}
