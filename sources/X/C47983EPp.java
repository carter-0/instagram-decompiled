package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.EPp  reason: case insensitive filesystem */
public final class C47983EPp extends E4R {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenWithRectangularImageFragment";
    public IgImageView A00;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1047167028);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_fullscreen_rectangular_image_fragment, viewGroup, false);
        IgImageView A002 = E4R.A00(inflate, this);
        this.A00 = A002;
        this.A05 = A002;
        this.A00 = inflate.findViewById(R.id.content_container);
        AnonymousClass0fD.A09(-1274390395, A02);
        return inflate;
    }
}
