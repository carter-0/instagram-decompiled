package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView;

/* renamed from: X.5zU  reason: invalid class name and case insensitive filesystem */
public final class C301545zU implements View.OnLayoutChangeListener {
    public final /* synthetic */ LegacyCameraDestinationScrollView A00;

    public C301545zU(LegacyCameraDestinationScrollView legacyCameraDestinationScrollView) {
        this.A00 = legacyCameraDestinationScrollView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = this.A00;
        ReboundHorizontalScrollView reboundHorizontalScrollView = legacyCameraDestinationScrollView.A06;
        int childCount = reboundHorizontalScrollView.getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            i9 += reboundHorizontalScrollView.getChildAt(i10).getWidth();
        }
        Resources resources = legacyCameraDestinationScrollView.getResources();
        int dimensionPixelSize = i9 + resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        View view2 = legacyCameraDestinationScrollView.A04;
        if (view2.getWidth() != dimensionPixelSize) {
            0nA.A0f(view2, dimensionPixelSize);
        }
        if (view2.getHeight() != dimensionPixelSize2) {
            0nA.A0V(view2, dimensionPixelSize2);
        }
    }
}
