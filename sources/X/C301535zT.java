package X;

import android.view.ViewTreeObserver;
import com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView;

/* renamed from: X.5zT  reason: invalid class name and case insensitive filesystem */
public final class C301535zT implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ LegacyCameraDestinationScrollView A00;

    public C301535zT(LegacyCameraDestinationScrollView legacyCameraDestinationScrollView) {
        this.A00 = legacyCameraDestinationScrollView;
    }

    public final void onScrollChanged() {
        LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = this.A00;
        legacyCameraDestinationScrollView.A05.setScrollX(legacyCameraDestinationScrollView.A06.getScrollX());
    }
}
