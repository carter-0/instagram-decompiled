package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Jn0  reason: case insensitive filesystem */
public final class C60529Jn0 extends C249703kE {
    public final IgMultiImageButton A00;

    public C60529Jn0(View view, float f) {
        super(view);
        ((MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.media_image_grid_item_frame_layout)).A00 = f;
        IgMultiImageButton igMultiImageButton = (IgMultiImageButton) view.requireViewById(R.id.media_image_button);
        this.A00 = igMultiImageButton;
        igMultiImageButton.A00 = f;
    }
}
