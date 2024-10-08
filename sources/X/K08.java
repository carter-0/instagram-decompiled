package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.arlink.ui.NametagCardHintView;

public final class K08 extends C232922uf {
    public final /* synthetic */ KB1 A00;

    public K08(KB1 kb1) {
        this.A00 = kb1;
    }

    public final void DmE(2cs r11) {
        float min = (float) Math.min(Math.max(r11.A09.A00, 0.0d), 1.0d);
        float f = 1.0f - min;
        KB1 kb1 = this.A00;
        ImageView imageView = kb1.A0M;
        imageView.setAlpha(f);
        int i = 0;
        imageView.setVisibility(JTQ.A01((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        NametagCardHintView nametagCardHintView = kb1.A0Q;
        if (f <= 0.0f) {
            i = 8;
        }
        nametagCardHintView.setVisibility(i);
        nametagCardHintView.setAlpha(f);
        if (r11.A0C()) {
            int i2 = (r11.A01 > 0.0d ? 1 : (r11.A01 == 0.0d ? 0 : -1));
            NametagController nametagController = kb1.A0P;
            if (i2 == 0) {
                nametagController.A04 = true;
                nametagController.A0A.A06 = true;
                nametagController.mTopBarScanQRButton.setEnabled(true);
                nametagController.A05 = true;
            } else {
                nametagController.A04 = false;
                nametagController.A0A.A06 = false;
                nametagController.mTopBarScanQRButton.setEnabled(true);
            }
        }
        NametagController nametagController2 = kb1.A0P;
        if (nametagController2.A05) {
            nametagController2.mCardView.setAlpha(min);
            int i3 = 0;
            nametagController2.mCardView.setVisibility(JTQ.A01((min > 0.0f ? 1 : (min == 0.0f ? 0 : -1))));
            View view = nametagController2.mProfileShareCardView;
            if (view != null) {
                view.setAlpha(min);
                view.setVisibility(JTQ.A01((min > 0.0f ? 1 : (min == 0.0f ? 0 : -1))));
            }
            float f2 = 1.0f - min;
            nametagController2.mGradientOverlay.setAlpha(f2);
            View view2 = nametagController2.mGradientOverlay;
            if (f2 <= 0.0f) {
                i3 = 8;
            }
            view2.setVisibility(i3);
            nametagController2.A09.A09(min);
        }
    }
}
