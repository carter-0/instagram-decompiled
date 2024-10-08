package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.business.ui.widget.IgABTestMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Jmy  reason: case insensitive filesystem */
public final class C60527Jmy extends C249703kE {
    public final IgABTestMultiImageButton A00;

    public C60527Jmy(View view, float f) {
        super(view);
        ((MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.media_image_grid_item_frame_layout)).A00 = f;
        IgABTestMultiImageButton igABTestMultiImageButton = (IgABTestMultiImageButton) view.requireViewById(R.id.media_image_button);
        this.A00 = igABTestMultiImageButton;
        igABTestMultiImageButton.A00 = f;
        igABTestMultiImageButton.setNumberedCheckBoxEnabled(false);
        igABTestMultiImageButton.setBottomRightAlphabetCircleDrawableEnabled(true);
        igABTestMultiImageButton.setBottomCenterAlphabetCircleDrawableEnabled(false);
    }
}
