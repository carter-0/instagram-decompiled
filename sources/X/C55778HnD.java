package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.HnD  reason: case insensitive filesystem */
public final class C55778HnD {
    public final AnonymousClass3V8 A00;
    public final C256053v9 A01;
    public final IgStaticMapView A02;
    public final MediaFrameLayout A03;

    public C55778HnD(View view) {
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view.requireViewById(R.id.carousel_map_media_group);
        this.A03 = mediaFrameLayout;
        mediaFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "map_view");
        this.A00 = new AnonymousClass3V8(view);
        this.A02 = (IgStaticMapView) view.requireViewById(R.id.carousel_map_view);
        this.A01 = new C256053v9(view.requireViewById(R.id.larger_cta_top_buffer));
    }
}
