package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.NuO  reason: case insensitive filesystem */
public abstract class C69922NuO {
    public static final C361648gZ A00(Context context, Integer num, int i, boolean z, boolean z2) {
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        int i2;
        Resources resources = context.getResources();
        if (num != null) {
            dimensionPixelOffset = num.intValue();
        } else {
            dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.ad4ad_button_bottom_margin);
        }
        if (z2) {
            i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        } else {
            dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.asset_picker_cell_margin);
            i2 = R.dimen.accent_edge_thickness;
        }
        return new C361648gZ(z, dimensionPixelOffset, dimensionPixelOffset2, resources.getDimensionPixelOffset(i2), i);
    }
}
