package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class PQI implements C295005nO {
    public final int A00;
    public final Object A01;

    public PQI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFinish() {
        FrameLayout frameLayout;
        switch (this.A00) {
            case 0:
                ((C67661Mrr) this.A01).A02.A08.setVisibility(8);
                return;
            case 1:
                NJZ njz = (NJZ) this.A01;
                NJZ.A00(njz);
                njz.A0D = true;
                IgSimpleImageView igSimpleImageView = njz.A04;
                if (igSimpleImageView != null) {
                    igSimpleImageView.getY();
                }
                IgdsInlineSearchBox igdsInlineSearchBox = njz.A0A;
                if (igdsInlineSearchBox != null) {
                    igdsInlineSearchBox.getY();
                }
                IgSimpleImageView igSimpleImageView2 = njz.A04;
                if (igSimpleImageView2 != null) {
                    igSimpleImageView2.getWidth();
                    return;
                }
                return;
            case 2:
                C71870OsD osD = (C71870OsD) this.A01;
                osD.A0R.A00.A08();
                C74501Pvv pvv = osD.A0E;
                if (pvv != null) {
                    if (!osD.A0G) {
                        pvv.D9I();
                    }
                    pvv.D9d();
                }
                osD.A0G = true;
                return;
            case 3:
                OZT ozt = (OZT) this.A01;
                IgTextView igTextView = ozt.A0A;
                ViewGroup viewGroup = (ViewGroup) igTextView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(igTextView);
                }
                FrameLayout frameLayout2 = ozt.A07;
                C71091OcD ocD = ozt.A02;
                if (ocD != null) {
                    frameLayout = ocD.A0D;
                } else {
                    frameLayout = null;
                }
                frameLayout2.removeView(frameLayout);
                return;
            case 4:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                DirectVisualMessageViewerController.A0N(directVisualMessageViewerController, false);
                directVisualMessageViewerController.A0e.finish();
                return;
            case 5:
                DirectVisualMessageViewerController.A0G((DirectVisualMessageViewerController) this.A01);
                return;
            default:
                double d = C7218Pzn.A0e;
                ((C7218Pzn) this.A01).A0X.DMt();
                return;
        }
    }
}
