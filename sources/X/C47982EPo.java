package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.EPo  reason: case insensitive filesystem */
public class C47982EPo extends E4R {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenWithCircularImageFragment";
    public CircularImageView A00;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1903742807);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_fullscreen_fragment, viewGroup, false);
        CircularImageView circularImageView = (CircularImageView) E4R.A00(inflate, this);
        this.A00 = circularImageView;
        this.A05 = circularImageView;
        this.A00 = inflate.findViewById(R.id.content_container);
        AnonymousClass0fD.A09(-896488725, A02);
        return inflate;
    }
}
