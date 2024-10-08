package X;

import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import com.instagram.video.live.mvvm.view.likes.customviews.MixedReactionsView;

public final class PQY implements C315616kD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PQY(IgImageView igImageView, MixedReactionsView mixedReactionsView) {
        this.A00 = 2;
        this.A01 = igImageView;
        this.A02 = mixedReactionsView;
    }

    public final void DaF(C294975nL r12, float f) {
        switch (this.A00) {
            case 0:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A02;
                ((RoundedCornerMediaFrameLayout) this.A01).setRadius((int) AnonymousClass37Q.A03((double) f, 20.0d, (double) 0nA.A04(directVisualMessageViewerController.A0e, 120)));
                DirectVisualMessageViewerController.A0J(directVisualMessageViewerController, 1.0f - f);
                return;
            case 1:
                DirectVisualMessageViewerController directVisualMessageViewerController2 = (DirectVisualMessageViewerController) this.A02;
                ((RoundedCornerMediaFrameLayout) this.A01).setRadius((int) AnonymousClass37Q.A03((double) f, (double) 0nA.A04(directVisualMessageViewerController2.A0e, 120), 20.0d));
                OEL oel = directVisualMessageViewerController2.reelViewerShadowAnimator;
                if (oel != null) {
                    oel.A00 = f;
                    oel.A02.A00(oel.A01, f);
                }
                DirectVisualMessageViewerController.A0J(directVisualMessageViewerController2, f);
                return;
            default:
                0qQ.A0B(r12, 0);
                if (f > 0.98f) {
                    r12.A0G();
                    View view = (View) this.A01;
                    C294975nL A0E = JTP.A0c(view, 0).A0E(C71392co.A02(1.0d));
                    A0E.A0V(1.0f, 0.0f, ((float) view.getHeight()) / 4.0f);
                    A0E.A0U(1.0f, 0.0f, AnonymousClass7TE.A02(view) / 4.0f);
                    A0E.A0M(1.0f, 0.0f);
                    A0E.A05 = new C65718LyY(6, view, this.A02);
                    A0E.A0H();
                    return;
                }
                return;
        }
    }

    public PQY(DirectVisualMessageViewerController directVisualMessageViewerController, RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout, int i) {
        this.A00 = i;
        this.A01 = roundedCornerMediaFrameLayout;
        this.A02 = directVisualMessageViewerController;
    }
}
