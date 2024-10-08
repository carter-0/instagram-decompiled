package X;

import android.view.View;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.OJt  reason: case insensitive filesystem */
public final class C70747OJt {
    public final /* synthetic */ C68445NIi A00;

    public C70747OJt(C68445NIi nIi) {
        this.A00 = nIi;
    }

    public final void A00(String str) {
        SegmentedProgressBar segmentedProgressBar;
        String str2;
        0qQ.A0B(str, 0);
        C68445NIi nIi = this.A00;
        View view = nIi.A00;
        if (view == null) {
            str2 = "childCameraFragmentHolder";
        } else {
            view.setVisibility(8);
            View view2 = nIi.A01;
            if (view2 == null) {
                str2 = "childViewerFragmentHolder";
            } else {
                view2.setVisibility(0);
                OW9 ow9 = nIi.A04;
                if (ow9 == null) {
                    str2 = "timelineController";
                } else {
                    ow9.A01();
                    C68463NJb A0R = nIi.getChildFragmentManager().A0R(nIi.A06);
                    0qQ.A0C(A0R, "null cannot be cast to non-null type com.instagram.direct.visual.DirectVisualMessageViewerFragment");
                    DirectVisualMessageViewerController directVisualMessageViewerController = A0R.A01;
                    if (directVisualMessageViewerController == null) {
                        return;
                    }
                    if (directVisualMessageViewerController.A0f.isAdded()) {
                        OW6 ow6 = directVisualMessageViewerController.A0G;
                        if (ow6 != null) {
                            DirectVisualMessageViewerController.A0F(directVisualMessageViewerController);
                            DirectVisualMessageViewerController.A0K(directVisualMessageViewerController, 11);
                            if (DirectVisualMessageViewerController.A00(directVisualMessageViewerController, AnonymousClass0t1.A01.A01(directVisualMessageViewerController.A0m), str) == -1) {
                                boolean z = true;
                                if (directVisualMessageViewerController.A0c == 1) {
                                    z = false;
                                }
                                DirectVisualMessageViewerController.A0L(directVisualMessageViewerController, 1, z);
                                return;
                            }
                            DirectVisualMessageViewerController.A0E(directVisualMessageViewerController);
                            int i = ow6.A00;
                            C68167N3h A01 = ow6.A01(i);
                            if (A01 != null && A01.A0Y && (segmentedProgressBar = directVisualMessageViewerController.progressBar) != null) {
                                segmentedProgressBar.A05(i);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    directVisualMessageViewerController.A0Q = str;
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
