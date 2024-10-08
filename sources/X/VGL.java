package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.feed.widget.IgProgressImageView;

public abstract class VGL {
    public static final void A00(ReboundHorizontalScrollView reboundHorizontalScrollView, C18065Vkr vkr, Uw7 uw7, Integer num, Integer num2) {
        View childAt;
        VTP vtp;
        View childAt2;
        VTP vtp2;
        C51972G9s.A1D(uw7, vkr);
        IgProgressImageView igProgressImageView = null;
        if (!(num == null || (childAt2 = reboundHorizontalScrollView.getChildAt(num.intValue())) == null)) {
            Object tag = childAt2.getTag();
            if ((tag instanceof VTP) && (vtp2 = (VTP) tag) != null) {
                igProgressImageView = vtp2.A00;
            }
            C315596kB.A09(new View[]{igProgressImageView}, false);
        }
        if (num2 != null && (childAt = reboundHorizontalScrollView.getChildAt(num2.intValue())) != null) {
            Object tag2 = childAt.getTag();
            if ((tag2 instanceof VTP) && (vtp = (VTP) tag2) != null) {
                C13989Tnp.A1B(vtp.A00, uw7, Uw7.PLAYING, true);
                if (uw7 != Uw7.A02) {
                    vkr.A01(vtp.A01);
                }
            }
        }
    }
}
