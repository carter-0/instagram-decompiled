package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8br  reason: invalid class name and case insensitive filesystem */
public final class C359028br {
    public final Context A00;
    public final TargetViewSizeProvider A01;

    public final int A00() {
        return ((NineSixteenLayoutConfigImpl) this.A01).A06 - (I7E.A00(this.A00, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2);
    }

    public C359028br(Context context, TargetViewSizeProvider targetViewSizeProvider) {
        this.A00 = context;
        this.A01 = targetViewSizeProvider;
    }
}
