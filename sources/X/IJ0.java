package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

public final class IJ0 implements AnonymousClass2WT {
    public final /* synthetic */ C53959Gx3 A00;

    public IJ0(C53959Gx3 gx3) {
        this.A00 = gx3;
    }

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        View inflate = C51971G9r.A0O(context).inflate(R.layout.row_feed_carousel_media_image, (ViewGroup) null);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer");
        inflate.setTag(AnonymousClass4GB.A00(inflate, this.A00.A00, (ReboundViewPager) null, (AnonymousClass4G9) null));
        return inflate;
    }
}
